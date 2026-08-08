package com.mongodb.notes.security.controller;

import com.mongodb.notes.security.service.BruteForceAttackService;
import com.mongodb.notes.security.service.TokenService;
import com.mongodb.notes.security.dto.TokenResponseDTO;
import com.mongodb.notes.security.dto.UserLoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin("*")
public class SecurityController {

    @Value("${api.security.login.username}")
    private String username;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private BruteForceAttackService bruteForceAttackService;

    @PostMapping
    public TokenResponseDTO login(@RequestBody UserLoginDTO userLoginDTO) {
        try {
            var usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userLoginDTO.username(), userLoginDTO.password());
            Authentication auth = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
            if (bruteForceAttackService.countAttemptAndValidateIsToBlockUserLogin(userLoginDTO.username(), false)) {
                throw new BadCredentialsException("Access Denied");
            }
            return new TokenResponseDTO(tokenService.generateToken((UserDetails) auth.getPrincipal()));
        } catch (Exception e) {
            if (username.equals(userLoginDTO.username()) && bruteForceAttackService
                    .countAttemptAndValidateIsToBlockUserLogin(userLoginDTO.username(), true)) {
                throw new BadCredentialsException("Access Denied");
            }
            throw e;
        }
    }
}

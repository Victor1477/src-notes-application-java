package com.mongodb.notes.security.controller;

import com.mongodb.notes.security.service.TokenService;
import com.mongodb.notes.security.dto.TokenResponseDTO;
import com.mongodb.notes.security.dto.UserLoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin("*")
public class SecurityController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;

    @PostMapping
    public TokenResponseDTO login(@RequestBody UserLoginDTO userLoginDTO) {
        var usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userLoginDTO.username(), userLoginDTO.password());
        Authentication auth = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
        return new TokenResponseDTO(tokenService.generateToken((UserDetails) auth.getPrincipal()));
    }
}

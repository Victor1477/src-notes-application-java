package com.mongodb.notes.security.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class BruteForceAttackService {

    @Value("${api.security.login.username}")
    private String username;

    private final ConcurrentHashMap<String, UserLoginTracker> trackers = new ConcurrentHashMap<>();

    public boolean countAttemptAndValidateIsToBlockUserLogin(String username, Boolean isBadCredentials) {
        if (!this.username.equals(username)) {
            return false;
        }

        trackers.compute(username, (key, tracker) -> {
            if (tracker != null && tracker.lastAttempt().plusMinutes(15).isBefore(LocalDateTime.now())) {
                tracker = null;
            }

            if (Boolean.TRUE.equals(isBadCredentials)) {
                if (tracker == null) {
                    return new UserLoginTracker(LocalDateTime.now(), 1);
                }
                if (tracker.loginAttempts() < 3) {
                    return new UserLoginTracker(LocalDateTime.now(), tracker.loginAttempts() + 1);
                }
                return tracker;
            }

            return tracker;
        });

        UserLoginTracker tracker = trackers.get(username);
        return tracker != null && tracker.loginAttempts() > 2;
    }
}

record UserLoginTracker(LocalDateTime lastAttempt, Integer loginAttempts) {
}


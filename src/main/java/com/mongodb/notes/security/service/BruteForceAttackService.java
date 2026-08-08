package com.mongodb.notes.security.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;

@Service
public class BruteForceAttackService {

    private final HashMap<String, UserLoginTracker> trackers = new HashMap<>();

    public boolean countAttemptAndValidateIsToBlockUserLogin(String username, Boolean isBadCredentials) {
        if (trackers.containsKey(username)) {
            UserLoginTracker userLoginTracker = trackers.get(username);
            if (userLoginTracker.lastAttempt().plusMinutes(15).isBefore(LocalDateTime.now())) {
                trackers.remove(username);
            }
        }

        if (isBadCredentials) {
            if (!trackers.containsKey(username)) {
                trackers.put(username, new UserLoginTracker(LocalDateTime.now(), 1));
            } else {
                UserLoginTracker userLoginTracker = trackers.get(username);
                if (userLoginTracker.loginAttempts() < 3) {
                    trackers.put(username, new UserLoginTracker(LocalDateTime.now(), userLoginTracker.loginAttempts() + 1));
                }
            }
            return true;
        }

        if (trackers.containsKey(username)) {
            UserLoginTracker userLoginTracker = trackers.get(username);

            if (userLoginTracker.loginAttempts() > 2) {
                return true;
            } else {
                trackers.remove(username);
            }
        }

        return false;
    }
}

record UserLoginTracker(LocalDateTime lastAttempt, Integer loginAttempts) {
}


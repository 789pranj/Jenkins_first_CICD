package org.example.securitydemo1.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getAllUsers() {
        return "All users";
    }

    public String printName() {
        return "Nikhil";
    }
    
    public String printNames() {
        return "Nikhilyadav";
    }

}

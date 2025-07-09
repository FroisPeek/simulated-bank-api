package com.frois.backend_bank.service;

import org.springframework.stereotype.Service;

import com.frois.backend_bank.domain.User;

@Service
public class UserService {

    public String helloUser(User user) {
        return "Hello World " + user.getName() + " e seu email é: " + user.getEmail();
    }
}

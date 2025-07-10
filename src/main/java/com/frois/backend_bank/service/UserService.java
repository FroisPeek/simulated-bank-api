package com.frois.backend_bank.service;

import org.springframework.stereotype.Service;

import com.frois.backend_bank.model.User;

@Service
public class UserService {

    public String helloUser(User user) {
        return "Hello World " + user.getNome() + " e seu email é: " + user.getEmail();
    }
}

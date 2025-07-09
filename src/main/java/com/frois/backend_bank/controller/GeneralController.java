package com.frois.backend_bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.frois.backend_bank.domain.User;
import com.frois.backend_bank.service.UserService;

@RestController
@RequestMapping("/hello-world")
public class GeneralController {

    private UserService helloWorldService;

    public GeneralController(UserService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
    public String helloWorld(@RequestBody User body) {
        return helloWorldService.helloUser(body);
    }

    @PostMapping("/{id}")
    public String helloWordPost(
            @PathVariable String id,
            @RequestParam(value = "filter", defaultValue = "empty") String param,
            @RequestBody User body) {

        return "Hello World " + body.getName() + id + param;
    }

}
package com.frois.backend_bank.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.frois.backend_bank.model.User;
import com.frois.backend_bank.repository.UserRepository;
import com.frois.backend_bank.service.UserService;

@RestController
@RequestMapping("/users")
public class GeneralController {

    private UserService helloWorldService;
    private UserRepository userRepository;

    public GeneralController(UserService helloWorldService, UserRepository userRepository) {
        this.helloWorldService = helloWorldService;
        this.userRepository = userRepository;
    }

    @GetMapping("/hello")
    public String helloWorld(@RequestBody User body) {
        return helloWorldService.helloUser(body);
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> helloWordPost(
            @PathVariable String id,
            @RequestParam(value = "filter", defaultValue = "empty") String param,
            @RequestBody User body) {

        if (body.getNome().isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não permitido");
        }

        return ResponseEntity.ok("Hello World " + body.getNome() + id + param);
    }

    @GetMapping("/get-users")
    public Iterable<User> getAllUsers() {
        Iterable<User> users = userRepository.findAll();

        return users;
    }

}
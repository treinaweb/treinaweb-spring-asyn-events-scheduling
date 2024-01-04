package br.com.treinaweb.asynceventsscheduling.api.users.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.asynceventsscheduling.api.users.dtos.UserRequest;
import br.com.treinaweb.asynceventsscheduling.api.users.dtos.UserResponse;
import br.com.treinaweb.asynceventsscheduling.api.users.services.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserRestController {

    private final UserService userService;

    @PostMapping
    public UserResponse create(@RequestBody UserRequest userRequest) {
        return userService.create(userRequest);
    }
    
}

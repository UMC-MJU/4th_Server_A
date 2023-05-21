package com.june.API.controller;

import com.june.API.dto.user.UserCreateRequest;
import com.june.API.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class UserController {
    private final UserService userService;

    @PostMapping("/users")
    public void createUser(@RequestBody UserCreateRequest request){

        userService.createUser(request);
    }
}

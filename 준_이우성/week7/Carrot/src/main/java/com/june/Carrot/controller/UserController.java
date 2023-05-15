package com.june.Carrot.controller;

import com.june.Carrot.dto.user.UserCreateRequest;
import com.june.Carrot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class UserController {
    private final UserService userService;

    @PostMapping("/user/create")
    public void createUser(@RequestBody UserCreateRequest request){

        userService.createUser(request);
    }
}

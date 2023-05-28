package com.june.API.dto.user.request;

import lombok.Getter;

@Getter
public class UserCreateRequest {
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
}

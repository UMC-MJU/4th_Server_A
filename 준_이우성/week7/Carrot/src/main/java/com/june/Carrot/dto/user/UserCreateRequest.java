package com.june.Carrot.dto.user;

import lombok.Getter;

@Getter
public class UserCreateRequest {
    private String name;
    private String email;
    private String phoneNumber;
}

package com.example.umc_board.Dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LoginRequestDto {

    @ApiModelProperty(example = "test@test.com")
    private String email;

    @ApiModelProperty(example = "test123")
    private String password;

    @Builder
    public LoginRequestDto(String email, String password){
        this.email = email;
        this.password = password;
    }
}

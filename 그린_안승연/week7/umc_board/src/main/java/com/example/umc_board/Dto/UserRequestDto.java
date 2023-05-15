package com.example.umc_board.Dto;

import com.example.umc_board.Entity.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserRequestDto {

    @ApiModelProperty(example = "test@test.com")
    private String email;

    @ApiModelProperty(example = "tester")
    private String name;

    @ApiModelProperty(example = "test123")
    private String password;

    @Builder
    public UserRequestDto(String email, String name, String password){
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public User toEntity(){
        return User.builder()
                .email(email)
                .name(name)
                .password(password)
                .build();
    }
}

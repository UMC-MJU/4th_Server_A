package com.example.umc_board.Dto;

import com.example.umc_board.Entity.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDto {

    @ApiModelProperty(example = "test@test.com")
    private String email;

    @ApiModelProperty(example = "tester")
    private String name;

    public static UserResponseDto of(User user){
        return UserResponseDto.builder()
                .email(user.getEmail())
                .name(user.getName())
                .build();
    }
}

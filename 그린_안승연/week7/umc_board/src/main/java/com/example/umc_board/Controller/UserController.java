package com.example.umc_board.Controller;

import com.example.umc_board.Dto.LoginRequestDto;
import com.example.umc_board.Dto.UserRequestDto;
import com.example.umc_board.Dto.UserResponseDto;
import com.example.umc_board.Service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
@Api(value = "유저 API")
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    @ApiOperation(value = "회원가입 API")
    public ResponseEntity<UserResponseDto> join(@RequestBody UserRequestDto requestDto){
        return ResponseEntity.ok(UserResponseDto.of(userService.saveUser(requestDto)));
    }

    @PostMapping("/login")
    @ApiOperation(value = "로그인 API")
    public ResponseEntity<UserResponseDto> login(@RequestBody LoginRequestDto requestDto){
        return ResponseEntity.ok(UserResponseDto.of(userService.findUser(requestDto.getEmail(), requestDto.getPassword())));
    }
}

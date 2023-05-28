package com.example.week9.user.controller;

import com.example.icebutler_server.global.dto.response.ResponseCustom;
import com.example.icebutler_server.global.util.TokenUtils;
import com.example.icebutler_server.user.dto.request.UserAuthTokenReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RequestMapping("/auth")
@RestController
public class UserAuthController {

  private final TokenUtils tokenUtils;

  @PostMapping("/renew")
  public ResponseCustom<String> accessToken(@RequestBody
//                                            @Valid
                                            UserAuthTokenReq userAuthTokenReq) {
    return ResponseCustom.OK(tokenUtils.accessExpiration(userAuthTokenReq));
  }


}

package com.june.API.service;

import com.june.API.domain.User;
import com.june.API.dto.user.request.UserCreateRequest;
import com.june.API.dto.user.request.UserLoginRequest;
import com.june.API.repository.UserRepository;
import com.june.API.utils.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    @Value("${jwt.secret}")
    private String secretKey;
    private Long expiredMs = 1000 * 60 * 60l;
    @Transactional
    public void createUser(UserCreateRequest request){
        if(userRepository.findByEmail(request.getEmail()) != null){
            throw new IllegalArgumentException();
        }else{
            userRepository.save(new User(request.getPassword(), request.getName(), request.getEmail(), request.getPhoneNumber()));
        }
    }
    @Transactional
    public String login(UserLoginRequest request){
        User user = userRepository.findByEmailAndPassword(request.getEmail(), request.getPassword())
                .orElseThrow(IllegalAccessError::new);
        return JwtUtil.creatJwt(user.getName(), secretKey, expiredMs);
    }
}

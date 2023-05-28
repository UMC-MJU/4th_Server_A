package com.june.API.service;

import com.june.API.domain.User;
import com.june.API.dto.user.UserCreateRequest;
import com.june.API.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public void createUser(UserCreateRequest request){
        User user = userRepository.save(new User(request.getName(), request.getEmail(), request.getPhoneNumber()));
    }
}

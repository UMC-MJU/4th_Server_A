package com.june.Carrot.service;

import com.june.Carrot.domain.User;
import com.june.Carrot.dto.user.UserCreateRequest;
import com.june.Carrot.repository.UserRepository;
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

package com.example.umc_board.Service;

import com.example.umc_board.Dto.UserRequestDto;
import com.example.umc_board.Entity.User;
import com.example.umc_board.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public User saveUser(UserRequestDto requestDto){
        return userRepository.save(requestDto.toEntity());
    }

    @Transactional
    public User findUser(String email, String password){
        User user = userRepository.findByEmail(email);
        if(user.getPassword().equals(password))
            return user;
        else
            throw new RuntimeException("비밀번호가 일치하지 않습니다.");
    }
}

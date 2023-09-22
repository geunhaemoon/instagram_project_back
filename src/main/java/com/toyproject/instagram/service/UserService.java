package com.toyproject.instagram.service;


import com.toyproject.instagram.dto.SignupReqDto;
import com.toyproject.instagram.respository.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private  final UserMapper userMapper;
    private  final BCryptPasswordEncoder passwordEncoder;

    public void signupUser(SignupReqDto signupReqDto){
        Integer executeCount = userMapper.saveUser(signupReqDto.toUserEntity(passwordEncoder));
//        System.out.println(executeCount);       //리턴값 User
                                                // 결과값 Interger

    }
}

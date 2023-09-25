package com.toyproject.instagram.controller;
import com.toyproject.instagram.dto.SignupReqDto;
import com.toyproject.instagram.exception.SignupException;
import com.toyproject.instagram.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/api/v1/auth")
@RestController
@RequiredArgsConstructor
public class AuthenticationController {

    private  final UserService userService;

//    유저를 추가하는것
    @PostMapping("/user")
    public ResponseEntity<?> signup(@Valid @RequestBody SignupReqDto signupReqDto, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            Map<String, String> errorMap = new HashMap<>();
            bindingResult.getFieldErrors().forEach(error -> {
//                System.out.println(error.getDefaultMessage());
                // 이미존재하는메세지를출력
                errorMap.put(error.getField(), error.getDefaultMessage());
            });
            throw new SignupException(errorMap);
                            // 만든걸 강제로 예외발생시키려고 보내버림
        }

        userService.signupUser((signupReqDto));
        return ResponseEntity.ok(null);
    }


}

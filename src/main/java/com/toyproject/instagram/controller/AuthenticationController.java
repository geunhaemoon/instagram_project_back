package com.toyproject.instagram.controller;
import com.toyproject.instagram.dto.SignupReqDto;
import com.toyproject.instagram.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/auth")
@RestController
@RequiredArgsConstructor
public class AuthenticationController {

    private  final UserService userService;

//    유저를 추가하는것
    @PostMapping("/user")
    public ResponseEntity<?> signup(@RequestBody SignupReqDto signupReqDto){
        userService.signupUser((signupReqDto));
        return ResponseEntity.ok(null);
    }


}

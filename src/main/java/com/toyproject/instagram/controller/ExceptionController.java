package com.toyproject.instagram.controller;


import com.toyproject.instagram.exception.SignupException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice // 이게 먼데
public class ExceptionController {

                        //예외처리시킬 signupEx.class 기다리는중
    @ExceptionHandler(SignupException.class)
    public ResponseEntity<?> signupExceptionHandle(SignupException signupException){
        return  ResponseEntity.badRequest().body(signupException.getErrorMap());
    }                                                   // signup에서 getter 붙이고나서 여기서 geterrormap 사용
                                                            // 이게 예외처리 하는법

}

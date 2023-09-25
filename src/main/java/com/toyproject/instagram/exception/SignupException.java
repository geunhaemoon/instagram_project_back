package com.toyproject.instagram.exception;

import lombok.Getter;

import java.util.Map;

    // 커스텀 예외 만들기 (?)
@Getter
public class SignupException extends RuntimeException {
    private Map<String, String> errorMap;

    public SignupException( Map<String,String> errorMap){
        super("회원가입 유효성검사 오류");
        this.errorMap = errorMap; // 싸인업 예외
        errorMap.forEach((k,v)->{
            System.out.println(k + " : " + v);
        });
    }
}

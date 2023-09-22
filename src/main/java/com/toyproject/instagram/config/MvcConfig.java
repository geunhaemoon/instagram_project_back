package com.toyproject.instagram.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //컴포먼트, Component(Ioc 컨테이너에 설정 관련 객체 생성)
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")      // 모든 요청 엔드포인트
                .allowedMethods("*")    //모든 요청 메소드
                .allowedOrigins("*");   // 모든 요청 서버  ?https://naver.com
                // 네이버에 대한 허용을 허용 local3000 local300은 허용하겠다 랄까
    }
}

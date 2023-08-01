package com.example.demo.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 허용할 오리진 주소를 지정합니다.
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000") // 허용할 오리진 주소를 지정합니다.
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 허용할 HTTP 메서드 지정
                .allowedHeaders("*") // 허용할 HTTP 헤더 지정
                .allowCredentials(true); // 인증 정보를 허용할지 여부 (e.g., 쿠키)
    }
}


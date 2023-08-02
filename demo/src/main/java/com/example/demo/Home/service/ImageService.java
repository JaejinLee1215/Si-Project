package com.example.demo.Home.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

@Service
public class ImageService {
    // 이미지를 base64로 인코딩하는 메서드
    public String encodeImageToBase64(MultipartFile image) throws IOException {
        byte[] imageBytes = image.getBytes();
        return Base64.getEncoder().encodeToString(imageBytes);
    }
}

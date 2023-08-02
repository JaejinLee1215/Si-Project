package com.example.demo.Home.controller;

import com.example.demo.Home.model.ImageResponse;
import com.example.demo.Home.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/upload")
public class HomeController {
    private String base64Image = null; // 변수 추가

    @Autowired
    private ImageService imageService;

    @PostMapping
    public ResponseEntity<ImageResponse> uploadImage(@RequestParam("image") MultipartFile image) {
        try {
            base64Image = imageService.encodeImageToBase64(image); // POST로 받은 이미지를 base64로 인코딩하여 변수에 저장
            ImageResponse response = new ImageResponse("리액트에서 post로 전송받은 사진"); // 이미지 베이스 인코딩 값은 여기서 사용되지 않음
            return ResponseEntity.ok(response);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping
    public ResponseEntity<ImageResponse> getImage() {
        if (base64Image != null) {
            ImageResponse response = new ImageResponse(base64Image); // 이미지 베이스 인코딩 값이 여기서 사용됨
            return ResponseEntity.ok(response);
        } else {
            return null;
        }
//        if (base64Image == null) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ImageResponse("리액트에서 post로 전송받은 사진이 없습니다."));
//            return null;
//        }
    }
}
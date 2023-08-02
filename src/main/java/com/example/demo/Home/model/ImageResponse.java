package com.example.demo.Home.model;

import org.springframework.beans.factory.annotation.Autowired;

public class ImageResponse {
    @Autowired
    private String picture;

    public ImageResponse(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}

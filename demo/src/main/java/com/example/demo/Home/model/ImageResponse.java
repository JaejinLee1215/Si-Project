package com.example.demo.Home.model;

import org.springframework.beans.factory.annotation.Autowired;

public class ImageResponse {
    @Autowired
    private String picture1;

    public ImageResponse(String picture1) {
        this.picture1 = picture1;
    }

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1;
    }
}

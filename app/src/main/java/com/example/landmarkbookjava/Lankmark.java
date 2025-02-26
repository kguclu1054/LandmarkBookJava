package com.example.landmarkbookjava;

import java.io.Serializable;

public class Lankmark implements Serializable {


    String name;
    String country;
    int image;

    public Lankmark(String name, String country, int image){
        this.name = name;
        this.country= country;
        this.image = image;
    }

}

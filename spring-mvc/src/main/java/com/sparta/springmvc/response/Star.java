package com.sparta.springmvc.response;

import lombok.Getter;
import lombok.Setter;

@Getter
//@Setter
public class Star {
    String name;
    int age;

    public Star(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Star() {}
}
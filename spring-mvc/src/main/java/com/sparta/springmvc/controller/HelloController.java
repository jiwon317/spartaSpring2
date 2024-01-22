package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!!";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "GET METHOD 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "POST METHOD 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "PUT METHOD 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "DELETE METHOD 요청";
    }












}

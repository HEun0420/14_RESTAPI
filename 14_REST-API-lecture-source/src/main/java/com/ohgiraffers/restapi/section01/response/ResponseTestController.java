package com.ohgiraffers.restapi.section01.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody   // controller와 responsebody 합친게 restController
@RestController
@RequestMapping("/response")
public class ResponseTestController {

    // 문자열 응답 test
    @GetMapping("/hello")
    public String helloWorld(){
        System.out.println("hello world");

        return "hello world";
    }
}

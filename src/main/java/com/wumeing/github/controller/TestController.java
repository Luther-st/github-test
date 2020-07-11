package com.wumeing.github.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * 测试接口
     * @return
     */
    @GetMapping("/test")
    public String getTest(){
        return "测试文字";
    }
}

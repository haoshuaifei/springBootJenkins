package com.henu.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class LoginController {

    @GetMapping("/user/login")
    public String create() {
        return "登录成功";
    }
}

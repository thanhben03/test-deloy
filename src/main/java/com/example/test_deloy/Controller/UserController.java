package com.example.test_deloy.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    private String test() {
        return "ahiihi 123123123";
    }

    @PostMapping
    private String sda() {
        return "post method";
    }
}

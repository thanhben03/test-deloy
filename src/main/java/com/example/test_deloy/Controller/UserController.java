package com.example.test_deloy.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String create() {
        return "created success !";
    }

    @PostMapping
    public String update(@RequestParam String str) {
        return str;
    }

    @GetMapping("/file")
    public String getFileSuccess() {
        return "get file success !";
    }
}

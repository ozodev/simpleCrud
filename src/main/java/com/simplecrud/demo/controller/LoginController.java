package com.simplecrud.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("")
    public ResponseEntity holamundo() {
        return new ResponseEntity("ok", HttpStatus.OK);
    }

}

//localhost:8080/acacadawdawd
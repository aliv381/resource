package com.example.resource.controller;

import com.example.resource.model.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @PostMapping("/getUserName")
    public ResponseEntity<String> getName(@RequestBody UserDto user){
        return new ResponseEntity<>(user.getName(), HttpStatus.OK);
    }
}

package com.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/getStudent")
    public ResponseEntity<String> addStudent(){
        String name = "Ganesh";
        return new ResponseEntity<>(name, HttpStatus.OK);
    }
}

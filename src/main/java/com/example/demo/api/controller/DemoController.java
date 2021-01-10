package com.example.demo.api.controller;

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @PostMapping(value = "${endpoint.demo}")
    public void testPost() {
        demoService.saveDemo();
    }

    @GetMapping(value = "${endpoint.demo}")
    public ResponseEntity<String> testGet() {
        return new ResponseEntity<>("nghia", HttpStatus.OK);
    }
}

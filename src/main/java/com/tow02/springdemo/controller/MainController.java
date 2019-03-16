package com.tow02.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("")
    public Map index() {
        Map<String, Object> ajax = new HashMap<>();
        ajax.put("message", "Hello world!");
        return ajax;
    }

}

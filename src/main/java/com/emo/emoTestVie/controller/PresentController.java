package com.emo.emoTestVie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class PresentController {

    @GetMapping("/status")
    public HashMap<String, Object> get() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("status", "UP");
        return map;
    }
}

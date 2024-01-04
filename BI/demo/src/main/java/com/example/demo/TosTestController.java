package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TosTestController {
	
    @GetMapping("/tosTest")
    public String tosTest(
            @RequestParam String source,
            @RequestParam String userCode,
            @RequestParam String sessionId) {
        

        System.out.println("Source: " + source + ", User Code: " + userCode + ", Session ID: " + sessionId);
        return "Source: " + source + ", User Code: " + userCode + ", Session ID: " + sessionId;
    }
}

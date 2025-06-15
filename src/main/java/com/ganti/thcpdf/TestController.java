package com.ganti.thcpdf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/ping")
    public String ping() {
        return "Spring Boot app is up and running!";
    }
}

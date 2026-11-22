package com.acharya.dikshanta.StockFlow.controller;

import com.acharya.dikshanta.StockFlow.dto.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
    @GetMapping
    public ResponseEntity<ApiResponse<String>> healthStatus() {
        String message = String.format("Tomcat is running in %s", "8080");
        return ResponseEntity.ok().body(ApiResponse.success(message));
    }
}

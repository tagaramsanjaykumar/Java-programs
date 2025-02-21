package com.ai.gt.controller;

import com.ai.gt.service.ValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/validation")
public class ValidationCotroller {

    private final ValidationService validationService;

    public ValidationCotroller(ValidationService validationService) {
        this.validationService = validationService;
    }

    @GetMapping("/{name}")
    public ResponseEntity<String> validate(@PathVariable String name) {
        boolean result = validationService.validateName(name);
        if(result) {
            return ResponseEntity.ok("Name is valid");
        } else {
            return ResponseEntity.badRequest().body("Name is invalid");
        }
    }

    @PostMapping
    public ResponseEntity<String> validates(String data) {
        System.out.println("Post Validating...");
        return ResponseEntity.ok("Validated");
    }
}

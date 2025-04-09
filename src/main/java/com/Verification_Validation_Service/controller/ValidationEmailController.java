package com.Verification_Validation_Service.controller;

import com.Verification_Validation_Service.service.ValidationEmailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 09/04/2025, mercredi
 */
@RestController
@RequestMapping("/validationEmail")
public class ValidationEmailController {
     private final ValidationEmailService validationEmailService;


    public ValidationEmailController(ValidationEmailService validationEmailService) {
        this.validationEmailService = validationEmailService;
    }

    @PostMapping("")
    public ResponseEntity<?> validateEmail(@RequestParam String email) {
        validationEmailService.validateEmail(email);
        return ResponseEntity.ok("Email valide.");
    }
}

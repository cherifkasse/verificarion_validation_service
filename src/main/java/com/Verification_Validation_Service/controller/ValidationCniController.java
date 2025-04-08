package com.Verification_Validation_Service.controller;

import com.Verification_Validation_Service.service.ValidationCniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 07/04/2025, lundi
 */
@RestController
@RequestMapping("/validationCni")
public class ValidationCniController {
    @Autowired
    private ValidationCniService validationService;

    @PostMapping("/{cni}")
    public ResponseEntity<String> validateCni(
            @PathVariable String cni,
            @RequestParam(defaultValue = "false") boolean isCE) {

        validationService.validateCni(cni, isCE);
        return ResponseEntity.ok("CNI Valide.");
    }
}

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
@RequestMapping("/validationCni/")
public class ValidationCniController {
    @Autowired
    private ValidationCniService validationService;

    @PostMapping("cni/signataire_CE/{cni}")
    public ResponseEntity<String> validateSignataireV1(@PathVariable String cni) {
        validationService.validateCniForSignataire(cni);
        return ResponseEntity.status(HttpStatus.OK).body("CNI Valide.");
    }

    @PostMapping("cni/signataire/{cni}")
    public ResponseEntity<String> validateSignataireV2(@PathVariable String cni) {
        validationService.validateCniForSignataireV2(cni);
        return ResponseEntity.status(HttpStatus.OK).body("CNI Valide.");
    }
}

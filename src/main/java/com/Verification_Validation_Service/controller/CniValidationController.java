package com.Verification_Validation_Service.controller;

import com.Verification_Validation_Service.service.CniValidationService;
import com.Verification_Validation_Service.validation.annotations.ValidCni;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 02/04/2025, mercredi
 */
@RestController
@RequestMapping("/verification_validation/")
public class CniValidationController {

    @Autowired
    private CniValidationService cniValidationService;

    @PostMapping("cni")
    public ResponseEntity<String> validateCni(@Valid @RequestParam("cni") String cni) {
        cniValidationService.validateCni(cni);
        return ResponseEntity.ok("CNI valide.");

    }


}

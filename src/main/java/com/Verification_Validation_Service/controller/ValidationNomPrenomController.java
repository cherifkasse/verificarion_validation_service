package com.Verification_Validation_Service.controller;

import com.Verification_Validation_Service.service.ValidationNomPrenomService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 09/04/2025, mercredi
 */
@RestController
@RequestMapping("/validationNomPrenom")
public class ValidationNomPrenomController {

    private final ValidationNomPrenomService validationNomPrenomService;

    public ValidationNomPrenomController(ValidationNomPrenomService validationNomPrenomService) {
        this.validationNomPrenomService = validationNomPrenomService;
    }

    @PostMapping("/{nomPrenom}")
    public ResponseEntity<?> validateNomPrenom(
            @PathVariable String nomPrenom) {

        validationNomPrenomService.validateNomPrenom(nomPrenom);
         return ResponseEntity.ok("Nom_Prenom Valide.");
    }
}

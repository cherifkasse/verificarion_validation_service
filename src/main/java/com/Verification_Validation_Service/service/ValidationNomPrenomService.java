package com.Verification_Validation_Service.service;

import com.Verification_Validation_Service.util.VerificationUtils;
import org.springframework.stereotype.Service;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 09/04/2025, mercredi
 */
@Service
public class ValidationNomPrenomService {

    public void validateNomPrenom(String nomPrenom) {
        // Validation du format Nom_Prenom (null, vide, regex…)
        VerificationUtils.validateNomPrenomFormat(nomPrenom);
    }
}

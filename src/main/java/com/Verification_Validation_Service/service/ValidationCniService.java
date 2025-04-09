package com.Verification_Validation_Service.service;

import com.Verification_Validation_Service.exception.CniAlreadyExistsException;
import com.Verification_Validation_Service.repository.SignataireRepository;
import com.Verification_Validation_Service.repository.Signataire_V2Repository;
import com.Verification_Validation_Service.util.VerificationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 07/04/2025, lundi
 */
@Service
public class ValidationCniService {

    private final SignataireRepository signataireRepository;

    private final Signataire_V2Repository signataireV2Repository;

    public ValidationCniService(SignataireRepository signataireRepository,Signataire_V2Repository signataireV2Repository) {
        this.signataireRepository = signataireRepository;
        this.signataireV2Repository = signataireV2Repository;
    }


    public void validateCni(String cni, boolean isCE) {
        // Validation du format du CNI (null, vide, regex…)
        VerificationUtils.validateCniFormat(cni);

        //La variable isCE fait référence aux signataires enregistrés via le Centre d'Enregistrement
        boolean exists = isCE
                ? signataireRepository.findByCniPassport(cni).isPresent()
                : signataireV2Repository.findByCni(cni).isPresent();

        if (exists) {
            throw new CniAlreadyExistsException("Ce numéro CNI est déjà enregistré"
                    + (isCE ? " pour CE." : "."));
        }
    }

}

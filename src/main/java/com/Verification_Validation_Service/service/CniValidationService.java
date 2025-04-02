package com.Verification_Validation_Service.service;

import com.Verification_Validation_Service.exception.CniAlreadyExistsException;
import com.Verification_Validation_Service.repository.SignataireRepository;
import com.Verification_Validation_Service.repository.Signataire_V2Repository;
import com.Verification_Validation_Service.validation.annotations.ValidCni;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 02/04/2025, mercredi
 */
@Service
public class CniValidationService {

    @Autowired
    private SignataireRepository signataireRepository;

    @Autowired
    private Signataire_V2Repository signataireV2Repository;

    public void validateCni(String cni) {
        // La vérification du format du CNI (taille, vide , null, etc) est déjà gérée par l'annotation avec ValidCni

        // Vérifier si le CNI existe dans la table Signataire (signataires Centre d'Enregistrement)
        if (signataireRepository.existsByCniPassport(cni)) {
            throw new CniAlreadyExistsException("Le CNI est déjà enregistré.");
        }

        // Vérifier si le CNI existe dans la table Signataire_V2 (Autres signataires ques ceux du CE)
        if (signataireV2Repository.existsByCni(cni)) {
            throw new CniAlreadyExistsException("Le CNI est déjà enregistré.");
        }


    }
}


package com.Verification_Validation_Service.service;

import com.Verification_Validation_Service.exception.CniAlreadyExistsException;
import com.Verification_Validation_Service.exception.InvalidCniFormatException;
import com.Verification_Validation_Service.repository.SignataireRepository;
import com.Verification_Validation_Service.repository.Signataire_V2Repository;
import com.Verification_Validation_Service.util.CniUtils;
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

    @Autowired
    private SignataireRepository signataireRepository;

    @Autowired
    private Signataire_V2Repository signataireV2Repository;



    // Méthode pour valider un CNI dans la table Signataire (Signataire pour le CE)
    public void validateCniForSignataire(String cni) {
        //Validation du format du cni
        CniUtils.validateCniFormat(cni);

        boolean existsInSignataire = signataireRepository.findByCniPassport(cni).isPresent();

        if (existsInSignataire) {
            throw new CniAlreadyExistsException("Ce numéro CNI est déjà enregistré.");
        }
    }

    // Méthode pour valider un CNI dans la table Signataire_V2 (Signer)
    public void validateCniForSignataireV2(String cni) {
        //Validation du format du cni
        CniUtils.validateCniFormat(cni);

        boolean existsInSignataireV2 = signataireV2Repository.findByCni(cni).isPresent();

        if (existsInSignataireV2) {
            throw new CniAlreadyExistsException("Ce numéro CNI est déjà enregistré.");
        }
    }
}

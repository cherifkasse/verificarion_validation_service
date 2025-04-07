package com.Verification_Validation_Service.util;

import com.Verification_Validation_Service.exception.InvalidCniFormatException;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 07/04/2025, lundi
 */
public class CniUtils {
    private static final String CNI_REGEX = "^[A-Za-z0-9]{1,15}$";

    public static void validateCniFormat(String cni) {
        if (cni == null || cni.trim().isEmpty()) {
            throw new InvalidCniFormatException("Le champ CNI ne doit pas être vide.");
        }

        if (!cni.trim().matches(CNI_REGEX)) {
            throw new InvalidCniFormatException("Le CNI doit contenir entre 1 et 15 caractères alphanumériques.");
        }
    }

}

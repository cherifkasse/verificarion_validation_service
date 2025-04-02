package com.Verification_Validation_Service.validation.annotations;

import com.Verification_Validation_Service.exception.InvalidCniFormatException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 02/04/2025, mercredi
 */
public class CniValidator implements ConstraintValidator<ValidCni, String> {
    // Définition de la regex pour un CNI composé exactement de 15 chiffres
    private static final String CNI_REGEX ="^[A-Za-z0-9]{15}$";
    @Override
    public void initialize(ValidCni constraintAnnotation) {
    }

    @Override
    public boolean isValid(String cni, ConstraintValidatorContext context) {
        // Vérifie si la valeur est nulle ou vide après suppression des espaces
        if (cni == null || cni.trim().isEmpty()) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Le CNI ne doit pas être vide.")
                    .addConstraintViolation();
            return false;
        }
        // Vérifie si la valeur match avec la regex
        if (!cni.matches(CNI_REGEX)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Le CNI doit contenir exactement 15 caractères alphanumériques.")
                    .addConstraintViolation();
            return false;
        }
        return true;

    }

}

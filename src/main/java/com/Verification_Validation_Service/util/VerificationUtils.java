package com.Verification_Validation_Service.util;

import com.Verification_Validation_Service.exception.InvalidCniFormatException;
import com.Verification_Validation_Service.exception.InvalidEmailFormatException;
import com.Verification_Validation_Service.exception.InvalidNomPrenomFormatException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 07/04/2025, lundi
 */
public class VerificationUtils {
    private static final String CNI_REGEX = "^[A-Za-z0-9]{1,15}$";

    private static final String NomPrenom_REGEX = "^[A-Za-z0-9 ]+$";

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    private static final Pattern EMAIL_REGEX = Pattern.compile(EMAIL_PATTERN);

    //Validation format CNI
    public static void validateCniFormat(String cni) {
        if (cni == null || cni.trim().isEmpty()) {
            throw new InvalidCniFormatException("Le champ CNI ne doit pas être vide.");
        }

        if (!cni.trim().matches(CNI_REGEX)) {
            throw new InvalidCniFormatException("Le CNI doit contenir entre 1 et 15 caractères alphanumériques.");
        }
    }

    //Validation format Nom_Prenom
    public static void validateNomPrenomFormat(
            String nomPrenom) {
        if (nomPrenom == null || nomPrenom.trim().isEmpty()) {
            throw new InvalidNomPrenomFormatException("Le champ ne doit pas être vide.");
        }

        if (!nomPrenom.trim().matches(NomPrenom_REGEX)) {
            throw new InvalidNomPrenomFormatException("Le champ doit contenir uniquement des lettres, chiffres et espaces.");
        }
    }

    //Validation format Email
    public static void validateEmailFormat(
            String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new InvalidEmailFormatException("L'email ne doit pas être vide.");
        }

        Matcher matcher = EMAIL_REGEX.matcher(email);
        if (!matcher.matches()) {
            throw new InvalidEmailFormatException("L'email doit être valide et respecter le format suivant : \n" +
                    "- Il doit commencer par des lettres, chiffres, ou les caractères spéciaux '-' ou '_'.\n" +
                    "- Il peut être suivi d'un ou plusieurs segments séparés par des points ('.'), où chaque segment peut contenir des lettres, chiffres, '-' ou '_'.\n" +
                    "- Ensuite, il doit contenir un '@'.\n" +
                    "- Après le '@', il doit y avoir un domaine constitué de lettres, chiffres, ou les caractères '-' et '_', suivi d'un ou plusieurs sous-domaines.\n" +
                    "- Enfin, l'email doit se terminer par une extension de domaine valide, comme '.com', '.org', etc., avec au moins deux lettres.\n" +
                    "Exemple valide : exemple@domaine.com");

        }
    }

}

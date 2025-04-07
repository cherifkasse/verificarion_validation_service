package com.Verification_Validation_Service.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
public class Signataire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Le nom complet ne doit pas être vide!")
    @Min(value = 3, message = "Le nom complet doit au moins contenir 3 caractères!")
    @Max(value = 50, message = "Le nom complet doit au plus contenir 50 caractères!")
    private String nomSignataire;

    private String categorie;
    private String nomApplication;

    @NotBlank(message = "Le code pin ne doit pas être vide!")
    private String codePin;

    @NotBlank(message = "L'adresse mail ne doit pas être vide!")
    private String email;

    private String dateCreation;
    private String dateExpiration;
    private String dateRenouvellement;

    @NotBlank(message = "Veuillez renseigner le nom de l'entreprise!")
    private String nomEntreprise;

    private String cleDeSignature;
    private String signerKey;

    @NotBlank(message = "Veuillez renseigner le CNI ou le passport!")
    private String cniPassport;

    private boolean isDisabled;
}
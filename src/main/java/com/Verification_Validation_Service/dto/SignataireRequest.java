package com.Verification_Validation_Service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NoArgsConstructor;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 02/04/2025, mercredi
 */
@NoArgsConstructor
public class SignataireRequest {

    @Schema(description = "L'ID du signataire")
    @JsonIgnore
    private Integer id;

    @Schema(description = "L'application rattachee")
    @JsonIgnore
    private String applicationRattachee;

    @Schema(description = "Nom de l'application")
    @JsonIgnore
    private String nomApplication;

    @Schema(description = "Le nom du signataire")
    private String nomSignataire;

    @Schema(description = "Le code pin du signataire")
    private String codePin;

    @Schema(description = "L'email du signataire")
    private String email;

    @Schema(description = "La categorie du signataire")
    private String categorie;

    @Schema(description = "Nom de l'entreprise du signataire")
    private String nomEntreprise;

    @Schema(description = "Cle de signature")
    @JsonIgnore
    private String cleDeSignature;

    @Schema(description = "La date de creation")
    @JsonIgnore
    private String dateCreation;

    @Schema(description = "La date d'expiration")
    @JsonIgnore
    private String dateExpiration;

    @Schema(description = "Nom de l'application de confiance")
    private String trustedApp;

    @Schema(description = "Demande de certificat")
    @JsonIgnore
    private String certificate_request;

    @Schema(description = "Nom du profil du certificat")
    @JsonIgnore
    private String certificate_profile_name;

    @Schema(description = "Nom du profil d'entité de fin")
    @JsonIgnore
    private String end_entity_profile_name;

    @Schema(description = "Nom de l'autorité de certification")
    @JsonIgnore
    private String certificate_authority_name;

    @Schema(description = "Nom d'utilisateur")
    @JsonIgnore
    private String username;

    @Schema(description = "Mot de passe")
    @JsonIgnore
    private String password;

    @Schema(description = "Numéro de CNI ou du passport du signataire")
    private String cniPassport;

    public SignataireRequest(Integer id, String applicationRattachee, String string, String prenom_nom,
                             String codePin, String email, String categorie, String nom_entreprise, String cleDeSignature,
                             String date_creation, String dateExpiration, String certificate_request,
                             String certificate_profile_name, String end_entity_profile_name,
                             String certificate_authority_name, String username, String password) {
        this.id = id;
        this.applicationRattachee = applicationRattachee;
        this.nomApplication = nomApplication;
        this.nomSignataire = prenom_nom;
        this.codePin = codePin;
        this.email = email;
        this.categorie = categorie;
        this.nomEntreprise = nom_entreprise;
        this.cleDeSignature = cleDeSignature;
        this.dateCreation = date_creation;
        this.dateExpiration = dateExpiration;
        this.certificate_request = certificate_request;
        this.certificate_profile_name = certificate_profile_name;
        this.end_entity_profile_name = end_entity_profile_name;
        this.certificate_authority_name = certificate_authority_name;
        this.username = username;
        this.password = password;
    }

    public SignataireRequest(String trustedApp, String prenom_nom, String codePin, String email,
                             String categorie, String nom_entreprise) {
        this.trustedApp = trustedApp;
        this.nomSignataire = prenom_nom;
        this.codePin = codePin;
        this.email = email;
        this.categorie = categorie;
        this.nomEntreprise = nom_entreprise;
    }

    public String getCniPassport() {
        return cniPassport;
    }

    public void setCniPassport(String cniPassport) {
        this.cniPassport = cniPassport;
    }
}

package com.Verification_Validation_Service.dto;

import com.Verification_Validation_Service.validation.annotations.ValidCni;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 02/04/2025, mercredi
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Informations du signataire à fournir.")
public class SignataireRequest_V2 {


    @NotBlank(message = "Le champ 'nomSignataire' est obligatoire")
    @ApiModelProperty(notes = "Le nom du signataire.", example = "Mon nom")
    private String nomSignataire;

    @NotBlank(message = "Le champ 'cni' est obligatoire")
    @ApiModelProperty(notes = "Le numéro d'identification nationale (NIN) du signataire.", example = "1 564 1777 00182")
    @ValidCni
    @NotNull
    private String cni;

    @NotBlank(message = "Le champ 'telephone' est obligatoire")
    @ApiModelProperty(notes = "Le numéro de téléphone du signataire.", example = "770000000")
    private String telephone;

    @ApiModelProperty(notes = "L'ID de l'application appelante fourni par GAINDE 2000", example = "35")
    private Integer idApplication;

    public SignataireRequest_V2(String nomSignataire, String cni) {
        this.nomSignataire = nomSignataire;
        this.cni = cni;

    }

}

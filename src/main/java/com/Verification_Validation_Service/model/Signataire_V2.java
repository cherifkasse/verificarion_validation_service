package com.Verification_Validation_Service.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "signer", uniqueConstraints = {
        @UniqueConstraint(columnNames = "cni")
})
@Getter
@Setter
public class Signataire_V2 {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;

 private Integer idSigner;

 @NotBlank(message = "Le champ 'nomSignataire' est obligatoire")
 private String nomSignataire;

 @NotBlank(message = "Le champ 'cni' est obligatoire")
 private String cni;

 private String codePin;
 private String signerKey;

 @Column(name = "id_application", nullable = true)
 private Integer idApplication;

 private String dateCreation;
 private String dateRenouvellement;
 private String dateExpiration;

 private String nomWorker;

 @NotBlank(message = "Le champ 'telephone' est obligatoire")
 @Column(nullable = true)
 private String telephone;
}

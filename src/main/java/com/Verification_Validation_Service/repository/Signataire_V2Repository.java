package com.Verification_Validation_Service.repository;

import com.Verification_Validation_Service.model.Signataire_V2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.validation.constraints.NotBlank;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 02/04/2025, mercredi
 */
public interface Signataire_V2Repository extends JpaRepository<Signataire_V2, Integer> {
    boolean existsByCni(String cni);
}

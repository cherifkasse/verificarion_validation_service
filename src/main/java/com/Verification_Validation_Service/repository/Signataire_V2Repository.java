package com.Verification_Validation_Service.repository;

import com.Verification_Validation_Service.model.Signataire_V2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 02/04/2025, mercredi
 */
public interface Signataire_V2Repository extends JpaRepository<Signataire_V2, Integer> {
    Optional<Signataire_V2> findByCni(String cni);
}

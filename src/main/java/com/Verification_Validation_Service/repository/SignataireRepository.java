package com.Verification_Validation_Service.repository;

import com.Verification_Validation_Service.model.Signataire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author : Mamadou Cherif KASSE
 * @email : mamadoucherifkasse@gmail.com
 * @created : 02/04/2025, mercredi
 * @version : 1.0
 */
public interface SignataireRepository extends JpaRepository<Signataire, Integer> {
     Optional<Signataire> findByCniPassport(String cniPassport);
}

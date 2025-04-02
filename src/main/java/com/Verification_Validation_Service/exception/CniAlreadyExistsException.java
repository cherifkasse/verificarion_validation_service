package com.Verification_Validation_Service.exception;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 02/04/2025, mercredi
 */
public class CniAlreadyExistsException extends RuntimeException {
    public CniAlreadyExistsException(String message) {
        super(message);
    }
}

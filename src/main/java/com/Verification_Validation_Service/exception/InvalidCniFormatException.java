package com.Verification_Validation_Service.exception;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 02/04/2025, mercredi
 */
public class InvalidCniFormatException  extends RuntimeException {
    public InvalidCniFormatException(String message) {
        super(message);
    }
}

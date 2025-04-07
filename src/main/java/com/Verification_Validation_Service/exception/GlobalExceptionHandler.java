package com.Verification_Validation_Service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : Mamadou Cherif KASSE
 * @version : 1.0
 * @email : mamadoucherifkasse@gmail.com
 * @created : 02/04/2025, mercredi
 */

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(InvalidCniFormatException.class)
    public ResponseEntity<String> handleInvalidCniFormatException(InvalidCniFormatException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(CniAlreadyExistsException.class)
    public ResponseEntity<String> handleCniAlreadyExistsException(CniAlreadyExistsException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }

    @ExceptionHandler(MissingPathVariableException.class)
    public ResponseEntity<String> handleMissingPathVariable(MissingPathVariableException ex) {
        return ResponseEntity.badRequest().body("Le CNI est requis dans l'URL.");
    }
}

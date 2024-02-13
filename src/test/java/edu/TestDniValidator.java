package edu;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDniValidator {
    private final DniValidator validator = new DniValidator();

    @Test
    public void testValidDniFormat() {
        assertTrue(validator.isValidFormat(12345678));
    }

    @Test
    public void testInvalidDniFormat() {
        assertFalse(validator.isValidFormat(123)); // Menos de 8 dígitos
        assertFalse(validator.isValidFormat(123456789)); // Más de 8 dígitos
        //assertFalse(validator.isValidFormat("12A45678")); // Carácter no numérico

}}

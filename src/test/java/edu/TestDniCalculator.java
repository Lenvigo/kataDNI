package edu;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.AssertJUnit.fail;

public class TestDniCalculator {

    private final DniCalculator calculator = new DniCalculator();
        @Test
        public void testCalculateLetter() {
            assertEquals('Z', calculator.calculateLetter(12345678));
            assertEquals('M', calculator.calculateLetter(98765432));

        }
        @Test //(expected=IllegalArgumentException.class)
        public void testInvalidDniFormat() {
            try {
                calculator.calculateLetter(123); // Menos de 8 dígitos, debería lanzar IllegalArgumentException
                fail("Debería haber lanzado IllegalArgumentException");
            } catch (IllegalArgumentException e) {
                assertEquals("Invalid DNI format: 123", e.getMessage());
            }
        }
        }



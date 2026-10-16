package itm.oss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator tests for OSS class")
class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    @DisplayName("Test for function add")
    void testAdd() {
        assertEquals(10, calc.add(5, 5), "5 + 5 should be 10");
    }

    @Test
    @DisplayName("Testing function isPrime with 5")
    void isFivePrime() {
        assertTrue(calc.isPrime(5), "5 is prime.");
    }

    @Test
    @DisplayName("Testing function isPrime with 4")
    void isFourPrime() {
        assertFalse(calc.isPrime(4), "4 is not prime.");
    }

    @Test
    @DisplayName("Testing function isPrime with 0")
    void isZeroNotPrime() {
        assertFalse(calc.isPrime(0), "0 is not prime.");
    }

    @Test
    @DisplayName("Testing function isPrime with negative numbers")
    void testNegativeNumbers() {
        assertFalse(calc.isPrime(-1), "There are not negative primer numbers.");
        assertFalse(calc.isPrime(-2), "There are not negative primer numbers.");
        assertFalse(calc.isPrime(-3), "There are not negative primer numbers.");
        assertFalse(calc.isPrime(-4), "There are not negative primer numbers.");
        assertFalse(calc.isPrime(-5), "There are not negative primer numbers.");
    }
    @Test
    @DisplayName("Test for function subtract")
    void testSubtract() {
        assertEquals(2, calc.subtract(5, 3), "5 - 3 should be 2");
    }

    @Test
    @DisplayName("Test for function multiply")
    void testMultiply() {
        assertEquals(12, calc.multiply(3, 4), "3 * 4 should be 12");
    }


    @Test
    @DisplayName("Test for function getNextPrime with 5")
    void testNextPrimeAfterFive() {
        assertEquals(7, calc.getNextPrime(5), "Next prime after 5 should be 7");
    }


}

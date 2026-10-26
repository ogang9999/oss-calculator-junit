package itm.oss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    @DisplayName("Intended error")
    void testAdd2() {
        assertEquals(10, calc.add(5, 5), "5 + 5 should be 9");
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
    @DisplayName("Testing divide") 
    void divisionTest() {
        assertEquals(10, calc.divide(100, 10), "100 / 10 = 10");
    }


    @Test 
    @DisplayName("Testing addition")
    void testAddition() {
        assertEquals(2, calc.add(1, 1), " 1+ 1 = 2");
        assertEquals(3, calc.add(1, 2), " 1+ 2 = 3");
        assertEquals(4, calc.add(1, 3), " 1+ 3 = 4");
        assertEquals(5, calc.add(1, 4), " 1+ 4 = 5");
        assertEquals(6, calc.add(1, 5), " 1+ 5 = 6");

    }

}

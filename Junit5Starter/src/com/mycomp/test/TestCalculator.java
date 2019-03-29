package com.mycomp.test;

import com.mycomp.core.Calculator;
import com.mycomp.core.StandardCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator should")
public class TestCalculator {

    @Test
    @DisplayName("Add two positive integers")
    public void shouldAddTwoPositiveIntegers() {
        Calculator calculator = new StandardCalculator();
        int additionResult = calculator.add(5, 6);
        assertEquals(11, additionResult, () -> "adding 5 and 6 returns 11");
    }

    @Test
    @DisplayName("Add multiple positive integers")
    public void shouldAddMultiplePositiveIntegers() {
        Calculator calculator = new StandardCalculator();
        int additionResult = calculator.add(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertAll(
            () -> assertEquals(55, additionResult, () -> "adding 1 to 10 returns 55"),
            () -> assertTrue(additionResult > 10)
        );
    }

    @Test
    @DisplayName("return zero for no input")
    public void shouldReturnZeroAsDefaultForNoInput() {
        Calculator calculator = new StandardCalculator();
        int additionResult = calculator.add(Arrays.asList());
        assertEquals(0, additionResult, () -> "should return zero for no input");
    }


    @Test
    @DisplayName("throw an exception for irrelevant input")
    public void shouldThrowExceptionForIrrelevantInput() {
        Calculator calculator = new StandardCalculator();
        Throwable message = assertThrows(RuntimeException.class, () -> calculator.add(1, -0));
        assertEquals("Illegal arguments", message.getMessage(),
                () -> "Should throw runtime exception");
    }
}

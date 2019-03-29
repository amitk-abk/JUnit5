package com.mycomp.test;

import com.mycomp.core.CompleteStandardCalculator;
import com.mycomp.core.Result;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("CompleteStandardCalculator should")
public class TestCompleteStandardCalculator {

    @Test
    @DisplayName("return complete result object for two inputs with other calculator")
    public void shouldReturnCompleteResultForTwoInputs() {
        CompleteStandardCalculator calculator = new CompleteStandardCalculator();
        Result actual = calculator.addTwo(5, 6);
        Result expected = new Result("Adding 5 and 6", "11");
        assertEquals(expected, actual);
    }
}

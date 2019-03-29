package com.mycomp.core;

import java.util.List;

public class CompleteStandardCalculator extends StandardCalculator {

    public Result addTwo(int firstNumber, int secondNumber) {
        return new Result("Adding " + firstNumber + " and " + secondNumber,
                String.valueOf(add(firstNumber, secondNumber)));
    }

}

package com.mycomp.core;

import java.util.List;

public class StandardCalculator implements Calculator {
    @Override
    public int add(int firstNumber, int secondNumber) throws RuntimeException {
        if (firstNumber == -0 || secondNumber == -0)
            throw new RuntimeException("Illegal arguments");
        return firstNumber + secondNumber;
    }

    @Override
    public int add(List<Integer> asList) {
        return asList.stream().reduce(0, Integer::sum);
    }
}

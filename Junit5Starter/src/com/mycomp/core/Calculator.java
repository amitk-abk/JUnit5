package com.mycomp.core;

import java.util.List;

public interface Calculator {
    int add(int firstNumber, int secondNumber);

    int add(List<Integer> asList);
}

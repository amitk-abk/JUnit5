package com.mycomp.core;

import java.util.Objects;

public class Result {
    private String input;
    private String result;

    public Result(String input, String result) {
        this.input = input;
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result1 = (Result) o;
        return Objects.equals(input, result1.input) &&
                Objects.equals(result, result1.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, result);
    }
}

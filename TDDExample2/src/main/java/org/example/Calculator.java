package org.example;



public class Calculator {

    public static float divide(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("Illegal Argument Exception.");
        }
        return a / b;
    }
}

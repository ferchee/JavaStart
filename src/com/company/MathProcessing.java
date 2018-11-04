package com.company;

public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyword(); // add
    char getSymbol();
    double doCalculation(double leftval, double rightVal);
}

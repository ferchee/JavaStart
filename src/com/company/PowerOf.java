package com.company;

/**
 * Created by Ferenc on 2018. 11. 04.
 */

public class PowerOf  implements MathProcessing{

    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculation(double leftval, double rightVal) {
        return Math.pow(leftval, rightVal);
    }
}

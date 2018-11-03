package com.company;

public class Subtracker extends CalculateBase {
    public Subtracker() { }
    public Subtracker (double leftVal, double rightVal)
    {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}

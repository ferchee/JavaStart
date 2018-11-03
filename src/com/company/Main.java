package com.company;

public class Main extends Object {

    public static void main(String[] args) {
        System.out.println("Calculation example!");

        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d, 92.0d),
                new Subtracker(225.0d, 17.0d),
                new Multiplier(11.0d, 3.0d)
        };

        for (CalculateBase calculator: calculators) {
            calculator.calculate();
            System.out.print("Result= ");
            System.out.println(calculator.getResult());
        }


    }
}

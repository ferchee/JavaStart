package com.company;

public class Main extends Object {

    public static void main(String[] args) {
        System.out.println("Calculation example!");

        //useCalculatorBase();

        String[] statements = {
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };
        CalculateHelper helper = new CalculateHelper();
        for (String statement:statements)
        {
            helper.process(statement);
            System.out.println(helper);
        }

    }

    private static void useCalculatorBase() {
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

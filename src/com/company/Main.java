package com.company;

public class Main extends Object {

    public static void main(String[] args) {
        System.out.println("Calculation example!");

        //useCalculatorBase();

        String[] statements = {
                "add 1.0",
                "add xx 25.0",
                "addX 0.0 0.0",
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };
        CalculateHelper helper = new CalculateHelper();
        for (String statement:statements)
        {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch ( InvalidStatementException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null)
                    System.out.println("Original exception: " + e.getCause().getMessage());
            }
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

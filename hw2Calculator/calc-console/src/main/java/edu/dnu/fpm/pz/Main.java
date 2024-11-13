package edu.dnu.fpm.pz;

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: <number1> <number2> <operator>");
            return;
        }

        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);
        String operator = args[2];

        Calculator calculator = new Calculator();
        double result;

        switch (operator) {
            case "+":
                result = calculator.addition(number1, number2);
                break;
            case "-":
                result = calculator.subtraction(number1, number2);
                break;
            case "*":
                result = calculator.multiplication(number1, number2);
                break;
            case "/":
                result = calculator.division(number1, number2);
                break;
            default:
                System.out.println("Invalid operator. Use +, -, * or /.");
                return;
        }

        System.out.printf("number1=%.2f number2=%.2f operator=%s result=%.2f%n", number1, number2, operator, result);
    }
}

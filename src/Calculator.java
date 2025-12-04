//Created this program to demonstrate Exception handlling in Java

import java.util.Scanner;

class InvalidOperatorException extends Exception {
    public InvalidOperatorException(String msg) {
        super(msg);
    }
}

public class Calculator {

    static double calculate(double a, double b, String op) throws InvalidOperatorException {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
            default: throw new InvalidOperatorException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = sc.nextDouble();
            System.out.println("Enter the Operator: ");
            String op = sc.next();
            double result = calculate(num1, num2, op);
            System.out.println(result);
        }
        catch (InvalidOperatorException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid input");
        }
        finally {
            System.out.println("Done");
        }
    }
}

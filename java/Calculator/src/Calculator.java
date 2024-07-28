import java.util.Scanner;
import java.lang.Math;

public class Calculator {

    // Method to perform calculation
    public double calculate(String expression) {
        // Remove spaces from the expression
        expression = expression.replaceAll("\\s", "");

        // Arrays to hold numbers and operators
        double[] numbers = parseNumbers(expression);
        char[] operators = parseOperators(expression);

        // Apply operator precedence
        double result = applyOperatorPrecedence(numbers, operators);

        return result;


        }

    private char[] parseOperators(String expression) {
    }

    private double[] parseNumbers(String expression) {
    }

    private double applyOperatorPrecedence(double[] numbers, char[] operators) {
        for (int i = 0; i < operators.length; i++) {
            if (operators[i] == '*' || operators[i] == '/') {
                if (operators[i] == '*') {
                    numbers[i] = numbers[i] * numbers[i + 1];
                }
                else if (operators[i] == '/') {
                numbers[i] = numbers[i] / numbers[i + 1];
                }
            }
    }


}
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
        return expression.replaceAll("[^+*/-]", "").toCharArray();
    }

    private double[] parseNumbers(String expression) {
        // Find all numbers in the expression
        String[] parts = expression.split("[+*/-]");
        double[] numbers = new double[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Double.parseDouble(parts[i]);
        }
        return numbers;
    }

    // Apply operator precedence
    private double applyOperatorPrecedence(double[] numbers, char[] operators) {
        int numberCount = numbers.length;
        int operatorCount = operators.length;

        // Сначала обрабатываем умножение и деление
        for (int i = 0; i < operatorCount; i++) {
            if (operators[i] == '*' || operators[i] == '/') {
                if (operators[i] == '*') {
                    numbers[i] = numbers[i] * numbers[i + 1];
                } else if (operators[i] == '/') {
                    numbers[i] = numbers[i] / numbers[i + 1];
                }

                // Сдвиг оставшихся чисел и операторов
                for (int j = i + 1; j < numberCount - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
                numberCount--;

                for (int j = i; j < operatorCount - 1; j++) {
                    operators[j] = operators[j + 1];
                }
                operatorCount--;

                i--; // Перепроверка оператора на текущем индексе
            }
        }

        // Обрабатываем сложение и вычитание
        double result = numbers[0];
        for (int i = 0; i < operatorCount; i++) {
            if (operators[i] == '+') {
                result += numbers[i + 1];
            } else if (operators[i] == '-') {
                result -= numbers[i + 1];
            }
        }

        return result;
    }


}
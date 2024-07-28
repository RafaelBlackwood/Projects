import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class Calculator {

    public double calculate(String expression) {
        expression = expression.replaceAll("\\s","");

        double[] numbers = parseNumbers(expression);
        char[] operators = parseOperators(expression);

        double result = applyOperatorPrecedence(numbers, operators);

        return result;
    }



    private char[] parseOperators(String expression) {

    }

    private double[] parseNumbers(String expression) {

    }

    private double applyOperatorPrecedence(double[] numbers, char[] operators) {

        for(char operator : operators) {
            if(operator == '*' || operator == '/') {
                numbers[0] *= numbers[1];
            }
        }

    }

}
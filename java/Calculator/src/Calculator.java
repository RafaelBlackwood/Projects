import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args) {

        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize Parser and Evaluator
        Parser parser = new Parser();
        Evaluator evaluator = new Evaluator();

        // Get user input
        System.out.print("Enter expression: ");
        String input = scanner.nextLine();

        // Tokenize the input expression

        // Evaluate the expression

        // Display the result

        // Close the scanner
        scanner.close();
    }

    private static void displayResult(double result) {
        System.out.println("Result: " + result);
    }
}
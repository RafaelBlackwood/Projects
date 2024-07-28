import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter a mathematical expression:");
        String expression = sc.nextLine();

        System.out.println(calc.calculate(expression));
    }

}

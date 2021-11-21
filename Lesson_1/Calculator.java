import java.util.Scanner;

public class Calculator { 
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Input operation (+, -, *, /, ^, %): ");
        String operandAsString = in.nextLine();
        char operand = operandAsString.charAt(0);

        System.out.print("Input first number: ");
        a = in.nextInt();
        System.out.print("Input second number: ");
        b = in.nextInt();

        System.out.println("dddd " + operand);

        float result = 0; 
        if (operand == '+') {
            result = a + b;
        } else if (operand == '-') {
            result = a - b;
        } else if (operand == '*') {
            result = a * b;
        } else if (operand == '/') {
            result = a / b;
        } else if (operand == '^') {
            result = a;
            for (int i = 2; i <= b; i++) {
                result = result * a;
            }
        } else if (operand == '%') {
            result = a % b;
        } else {
            System.out.println("Unrecognezed operand");
        }
        System.out.println("Result: " + result);
    }
}
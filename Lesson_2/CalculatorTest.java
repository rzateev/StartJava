import java.util.Scanner;

public class CalculatorTest { 
    public static void main(String[] args) {

        Calculator calc1 = new Calculator();
        Scanner in = new Scanner(System.in);

        System.out.print("Input operation (+, -, *, /, ^, %): ");
        char operand = in.nextLine().charAt(0);
        calc1.setOperand(operand);

        System.out.print("Input first number: ");
        calc1.setFirstNum(in.nextInt());

        System.out.print("Input second number: ");
        calc1.setFirstNum(in.nextInt());

        float result = calc1.Calc();
        System.out.println("Result: " + result);
    }
}
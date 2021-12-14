import java.util.Scanner;

public class CalculatorTest { 
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Boolean repeat = true;

        while (repeat) {
            Scanner console = new Scanner(System.in);
            System.out.print("Input operation (+, -, *, /, ^, %): ");
            char operand = console.nextLine().charAt(0);
            calc.setMathOperation(operand);

            System.out.print("Input first number: ");
            calc.setFirstNum(console.nextInt());

            System.out.print("Input second number: ");
            calc.setSecondNum(console.nextInt());

            int result = calc.calc();
            System.out.println("Result: " + result);

            console.nextLine();

            Boolean notRightAmswer = true;
            while (notRightAmswer) {
                System.out.print("Do you want repeat math operation? [yes/no]:");            
                String yesno = console.nextLine();
                if (yesno.equals("no")) {                    
                    repeat = false;
                    notRightAmswer = false;
                    } else if (yesno.equals("yes")) {
                        repeat = true;
                        notRightAmswer = false;
                    }
                }
            
        }
    }
}
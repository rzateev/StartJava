import java.util.Scanner;

public class MyFirstGame { 
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100);
        int userNumber = 0;

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input int number from 0 to 100: ");
        
            userNumber = in.nextInt();
                if (userNumber > secretNumber) {
                    System.out.println("Your number is bigger than secret number: ");
                } else if (userNumber < secretNumber) {
                    System.out.println("Your number is smaller than secret number: ");
                } else if (userNumber == secretNumber) {
                    System.out.println("Your are Win!!!");
                    break;
                }
        }
    }
}
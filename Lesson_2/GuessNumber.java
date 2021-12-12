import java.util.Scanner;

public class GuessNumber { 
    private Player playerFirst;
    private Player playerSecond;

    public GuessNumber(Player playerFirst, Player playerSecond) {
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;
    }

    public void play() {
        int secretNumber = (int) (Math.random() * 101);
        int userNumber = 0;
        boolean currnetUserFirst = true;
        Scanner in = new Scanner(System.in);
        while (userNumber != secretNumber) {
            if (currnetUserFirst) {
                System.out.print("Input int number from 0 to 100 First Player: ");
            } else {
                System.out.print("Input int number from 0 to 100 Second Player: ");
            }    
            userNumber = in.nextInt();
            if (userNumber > secretNumber) {
                System.out.println("Your number is bigger than secret number: ");                
            } else if (userNumber < secretNumber) {
                System.out.println("Your number is smaller than secret number: ");
            } 
            currnetUserFirst = !currnetUserFirst;
        }
        if (!currnetUserFirst) {
                System.out.print("Win First Player: "+playerFirst.getName());
            } else {
                System.out.print("Win Second Player: "+playerSecond.getName());
            }
    }
}

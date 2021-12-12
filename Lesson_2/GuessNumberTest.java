import java.util.Scanner;

public class GuessNumberTest { 
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of First Player: "); 
        Player playerFirst = new Player(in.nextLine());

        System.out.println("Enter name of Second Player: "); 
        Player playerSecond = new Player(in.nextLine());

        GuessNumber game = new GuessNumber(playerFirst, playerSecond);
        game.play();
    }
}
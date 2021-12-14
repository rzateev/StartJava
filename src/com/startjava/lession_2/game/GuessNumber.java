package com.startjava.lession_1.game;

import java.util.Scanner;

public class GuessNumber { 
    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void play() {
        int secretNumber = (int) (Math.random() * 101);
        int userNumber = 0;
        boolean currnetUserFirst = true;
        Scanner in = new Scanner(System.in);
        while (userNumber != secretNumber) {
            System.out.print("Input int number from 0 to 100 "+ (currnetUserFirst? "(first Player):": "(second Player):"));
            
            userNumber = in.nextInt();
            if (userNumber > secretNumber) {
                System.out.println("Your number is bigger than secret number: ");
            } else if (userNumber < secretNumber) {
                System.out.println("Your number is smaller than secret number: ");
            } 
            currnetUserFirst = !currnetUserFirst;
        }
        if (!currnetUserFirst) {
                System.out.println("Win First Player: "+firstPlayer.getName());
            } else {
                System.out.println("Win Second Player: "+secondPlayer.getName());
            }
    }
}

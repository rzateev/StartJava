package com.startjava.lession_1.game;

import java.util.Scanner;

public class GuessNumberTest { 
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter name of First Player: "); 
        Player playerFirst = new Player(console.nextLine());

        System.out.println("Enter name of Second Player: "); 
        Player playerSecond = new Player(console.nextLine());

        GuessNumber game = new GuessNumber(playerFirst, playerSecond);

        Boolean repeat = true;

        while (repeat) {
            game.play();
            Boolean notRightAmswer = true;
            while (notRightAmswer) {
                System.out.print("Do you want repeat game? [yes/no]:");            
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
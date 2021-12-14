package com.startjava.lession_1.game;

import java.util.Scanner;

public class MyFirstGame { 
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 101);
        int userNumber = 0;        
        Scanner in = new Scanner(System.in);
        while (userNumber != secretNumber) {
            System.out.print("Input int number from 0 to 100: ");
            userNumber = in.nextInt();
                if (userNumber > secretNumber) {
                    System.out.println("Your number is bigger than secret number: ");
                } else if (userNumber < secretNumber) {
                    System.out.println("Your number is smaller than secret number: ");
                } 
        }
        System.out.println("Your are Win!!!");
    }
}
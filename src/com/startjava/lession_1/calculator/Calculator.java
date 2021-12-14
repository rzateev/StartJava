package com.startjava.lession_1.calculator ;

import java.util.Scanner;

public class Calculator { 
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        System.out.print("Input operation (+, -, *, /, ^, %): ");
        char operand = in.nextLine().charAt(0);

        System.out.print("Input first number: ");
        int a = in.nextInt();
        System.out.print("Input second number: ");
        int b = in.nextInt();

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
                result *= a;
            }
        } else if (operand == '%') {
            result = a % b;
        } else {
            System.out.println("Unrecognezed operand");
        }
        System.out.println("Result: " + result);
    }
}
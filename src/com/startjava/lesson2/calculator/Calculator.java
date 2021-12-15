package com.startjava.lesson2.calculator;

import java.util.Scanner;

public class Calculator {
    private int firstNum;
    private int secondNum;
    private char mathOperation;
    private int result;

    public void setFirstNum(int value) {
        this.firstNum = value;
    }

    public void setSecondNum(int value) {
        this.secondNum = value;
    }

    public void setMathOperation(char value) {
        this.mathOperation = value;
    }

    public int calc() {
        switch (mathOperation) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if (secondNum == 0) {
                    result = 0;
                    break;
                }
                result = firstNum / secondNum;
                break;
            case '^':
                result = firstNum;
                for (int i = 2; i <= secondNum; i++) {
                    result *= firstNum;
                }
                break;
            case '%':
                result = firstNum % secondNum;
                break;
            default:
                System.out.println("Unrecognezed mathOperation");
        }
        return result;        
    }
}
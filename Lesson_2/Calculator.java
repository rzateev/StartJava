import java.util.Scanner;

public class Calculator {
    private int firstNum;
    private int secondNum;
    private char operand;
    private float result = 0;

    public int getFirstNum() {
        return this.firstNum;
    }

    public void setFirstNum(int value) {
        this.firstNum = value;
    }

    public int getSecondNum() {
        return this.secondNum;
    }

    public void setSecondNum(int value) {
        this.secondNum = value;
    }

    public char getOperand() {
        return this.operand;
    }

    public void setOperand(char value) {
        this.operand = value;
    }

    public float Calc() {        

        switch (this.operand) {
            case ('+'):
                this.result = this.firstNum + this.secondNum;
                break;
            case ('-'):
                this.result = this.firstNum - this.secondNum;
                break;
            case ('*'):
                this.result = this.firstNum * this.secondNum;
                break;
            case ('/'):
                if (this.secondNum == 0) {
                    this.result = 0;
                    break;
                }
                this.result = this.firstNum / this.secondNum;
                break;
            case ('^'):
                this.result = this.firstNum;
                for (int i = 2; i <= this.secondNum; i++) {
                    this.result *= this.firstNum;
                }
            case ('%'):
                this.result = this.firstNum % this.secondNum;
                break;
            default:
                System.out.println("Unrecognezed operand");
        }
        return this.result;
        //System.out.println("Result: " + this.result);
    }
}
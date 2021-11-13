public class ConditionalStatement {	
    public static void main(String[] args) {
        int age = 15;
        boolean isMan = true;
        double height = 1.73;
        char firstCharOfName = 'R';

        if (age>10) {
        	System.out.println("Age ="+age);
        }

        if (isMan) {
        	System.out.println("I am a man");
        }

        if (!isMan) {
        	System.out.println("I am not a man");
        }

        if (height<1.8) {
        	System.out.println("My height is "+height);
        }
        else
        {
        	System.out.println("My height >1.8");
        }

        if (firstCharOfName =='M') {
        	System.out.println("My first char of name is M");
        } else if (firstCharOfName =='I') {
        	System.out.println("My first char of name is I");
        } else {
        	System.out.println("My first char of name is "+firstCharOfName);
        }
    }
}
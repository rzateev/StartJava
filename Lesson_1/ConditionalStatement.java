public class ConditionalStatement { 
    public static void main(String[] args) {
        int age = 15;
        if (age > 10) {
            System.out.println("Age =" + age);
        }

        boolean isMan = true;
        if (isMan) {
            System.out.println("I am a man");
        }

        if (!isMan) {
            System.out.println("I am not a man");
        }

        double height = 1.73;
        if (height < 1.8) {
            System.out.println("My height is " + height);
        } else {
            System.out.println("My height >1.8");
        }

        char firstCharOfName = 'R';
        if (firstCharOfName =='M') {
            System.out.println("My first char of name is M");
        } else if (firstCharOfName =='I') {
            System.out.println("My first char of name is I");
        } else {
            System.out.println("My first char of name is " + firstCharOfName);
        }
    }
}
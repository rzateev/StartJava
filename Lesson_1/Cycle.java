public class Cycle {
    public static void main(String[] args) {
        System.out.println("for");
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("while");
        int i = 6;
        while(i >= -6) {
            System.out.println(i);
            i = i - 2;
        }

        System.out.println("do while");
        int sum = 0;
        i = 10;
        do {
            if(i % 2 !=0) {
                sum = sum + i;                
                System.out.println(i);
            }            
            i++;
        } while(i <= 20);
        System.out.println(sum);
    }
}
public class WolfTest {	
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.name = "Big wolf";
        wolf1.age = 10;
        wolf1.weight = 35;
        wolf1.sex = "man";
        wolf1.color = "black";

        System.out.println(wolf1.name);
        System.out.println(wolf1.age);
        System.out.println(wolf1.weight);
        System.out.println(wolf1.sex);
        System.out.println(wolf1.color);
        
        wolf1.move();
        wolf1.run();
        wolf1.sit();
        wolf1.hunt();
        wolf1.howl();
    }
}
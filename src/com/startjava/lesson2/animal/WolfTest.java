package com.startjava.lesson2.animal;

public class WolfTest {	
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.setName("Big wolf");
        wolf1.setAge(10);
        wolf1.setWeight(35);
        wolf1.setSex("man");
        wolf1.setColor("black");

        System.out.println(wolf1.getName());
        System.out.println(wolf1.getAge());
        System.out.println(wolf1.getWeight());
        System.out.println(wolf1.getSex());
        System.out.println(wolf1.getColor());
        
        wolf1.move();
        wolf1.run();
        wolf1.sit();
        wolf1.hunt();
        wolf1.howl();
    }
}
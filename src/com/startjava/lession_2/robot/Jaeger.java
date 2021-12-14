package com.startjava.lession_1.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private String status;
    private float speed;
    private String weapons;
   

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }


    void move() {
        System.out.println("moving");
    } 

    void scanKaiju() {
        System.out.println("scanning");
    } 

    void useVortexCannon() {
        System.out.println("activated");
    }

void printInfo() {
        System.out.println("==============");
        System.out.println("Model Name: "+this.modelName);
        System.out.println("Mark: "+this.mark);
        System.out.println("Origin: "+this.origin);
        System.out.println("Status: "+this.status);
        System.out.println("Speed: "+this.speed);
        System.out.println("Weapons: "+this.weapons);
    } 

}
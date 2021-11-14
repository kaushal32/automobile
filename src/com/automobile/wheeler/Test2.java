//package automobile;
//
//public class Test2 {
//
//}




package com.automobile.wheeler;


import automobile.Vehicle;

import java.util.Scanner;

class Hero extends Vehicle
{
    String modelName, registrationNumber, ownerName;
    int speed;
    Hero(String modelName, String registrationNumber, String ownerName, int speed)
    {
        this.modelName=modelName;
        this.ownerName=ownerName;
        this.registrationNumber=registrationNumber;
        this.speed=speed;
    }
    public void getModelName()
    {
        System.out.println("modelName: " + modelName);
    }
    public void getRegistrationNumber()
    {
        System.out.println("registrationNumber: " + registrationNumber);
    }
    public void getOwnerName()
    {
        System.out.println("ownerName: " + ownerName);
    }
    public int getSpeed()
    {
        return speed;
    }
    public void radio()
    {
        System.out.println("Accessing the radio");
    }
}
class Honda extends Vehicle
{
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;
    Honda(String modelName, String registrationNumber, String ownerName, int speed)
    {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }
    public void getModelName()
    {
        System.out.println("modelName: " + modelName);
    }
    public void getRegistrationNumber()
    {
        System.out.println("registrationNumber: " + registrationNumber);
    }
    public void getOwnerName()
    {
        System.out.println("ownerName: " + ownerName);
    }
    public int getSpeed()
    {
        return speed;
    }
    public void cdplayer()
    {
        System.out.println("Accessing CD Player.");
    }
}
class Test1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Hero hero = new Hero(sc.next(), sc.next(), sc.next(), sc.nextInt());
        hero.getModelName();
        hero.getOwnerName();
        hero.getRegistrationNumber();
        System.out.println(hero.getSpeed());
        hero.radio();

        System.out.println();

        Honda honda = new Honda(sc.next(), sc.next(), sc.next(), sc.nextInt());
        honda.getModelName();
        honda.getOwnerName();
        honda.getRegistrationNumber();
        System.out.println(honda.getSpeed());
        honda.cdplayer();

    }
}
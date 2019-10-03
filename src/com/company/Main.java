package com.company;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal(4, "mammal");

//        Animal animal1 = new Animal(2);

        Animal animal2 = new Animal();

        System.out.println(animal.getType());
        System.out.println(animal2.getType());

//        System.out.println(animal1.getNumberOfLegs());

        System.out.println("Top speed of "+ animal2.getName() + " is "+ animal2.getTopSpeed());
        animal2.setTopSpeed(100);
        System.out.println("Top speed of "+ animal2.getName() + " is "+ animal2.getTopSpeed());


    }
}

package com.company;

public class Animal {
    private int numberOfLegs;
    private String type;
    private int topSpeed;
    private String isEndangered;
    private String name;

    Animal(int numberOfLegs, String type){
        this.numberOfLegs = numberOfLegs;
        this.type = type;
    }

//    Animal(int numberOfLegs){
//        this.numberOfLegs = numberOfLegs;
//    }

    Animal(){
        this.numberOfLegs = 6;
        this.type = "amphibian";
        this.topSpeed = 50;
        this.isEndangered = "danger";
        this.name = "Lizard";
    }

    public String getIsEndangered() {
        return isEndangered;
    }

    public void setIsEndangered(String isEndangered) {
        this.isEndangered = isEndangered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

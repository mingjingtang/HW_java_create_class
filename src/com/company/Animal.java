package com.company;

public class Animal {
    private int numberOfLegs;
    private String type;

    Animal(int numberOfLegs, String type){
        this.numberOfLegs = numberOfLegs;
        this.type = type;
    }

    Animal(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }

    Animal(){
        this.numberOfLegs = 6;
        this.type = "amphibian";
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

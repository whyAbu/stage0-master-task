package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public Animal() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colour) {
        this.color = colour;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public String getDescription(Animal animal){
        if (animal.isHasFur()){
            return (String) "This animal is mostly "+animal.getColor()+". It has "+animal.getNumberOfPaws()+" paws and a fur.";
        }return (String) "This animal is mostly "+animal.getColor()+". It has "+animal.getNumberOfPaws()+" paws and no fur.";
    }
};

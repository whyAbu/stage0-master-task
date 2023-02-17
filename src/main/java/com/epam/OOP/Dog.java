package com.epam.OOP;

public class Dog extends Animal{
    public Dog(String colour, int numberOfPaws, boolean hasFur) {
        super(colour, numberOfPaws, hasFur);
    }

    public Dog() {
    }


    @Override
    public String getDescription(Animal animal) {
        String description = super.getDescription(new Dog("brown",4,true));
        return description;
    }
}

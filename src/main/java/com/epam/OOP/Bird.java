package com.epam.OOP;

public class Bird extends Animal{
    public Bird(String colour, int numberOfPaws, boolean hasFur) {
        super(colour, numberOfPaws, hasFur);
    }

    public Bird(){}

    @Override
    public String getDescription(Animal animal) {
        String description = super.getDescription(new Bird("blue",2,false));
        return description + " Moreover, it has 2 wings and can fly.";
    }
}

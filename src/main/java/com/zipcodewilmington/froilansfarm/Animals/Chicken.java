package com.zipcodewilmington.froilansfarm.Animals;

public class Chicken extends ChickenAbstract{
    @Override
    public String eat() {
        return "yum";
    }

    @Override
    public String makeNoise() {
        return "bawk";
    }
}

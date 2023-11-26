package com.zipcodewilmington.froilansfarm.Animals;

public class Horse extends HorseAbstract{
    @Override
    public String eat() {
        return "yum";
    }

    @Override
    public String makeNoise() {
        return "neigh";
    }
}
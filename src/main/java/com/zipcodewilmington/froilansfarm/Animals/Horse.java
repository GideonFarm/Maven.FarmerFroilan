package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Utilities.Edible;

public class Horse extends HorseAbstract{
    @Override
    public String makeNoise() {
        return "neigh";
    }

    @Override
    public boolean eat(Edible edible) {
        return true;
    }
}
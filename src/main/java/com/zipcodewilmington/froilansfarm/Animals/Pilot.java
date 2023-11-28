package com.zipcodewilmington.froilansfarm.Animals;
import com.zipcodewilmington.froilansfarm.Utilities.Edible;

public class Pilot extends Person {

    public static boolean eat(int i) {
        return true;
    }

    @Override
    public boolean eat(Edible edible) {
        return true;
    }

    @Override
    public String makeNoise() {
        return "Hello";
    }

    @Override
    public boolean mount(Object rideable) {
        return true;
    }

    @Override
    public boolean dismount(Object rideable) {
        return true;
    }
}

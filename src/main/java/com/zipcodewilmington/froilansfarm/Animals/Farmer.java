package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.CropsAndProduce.Crop;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.CropRow;
import com.zipcodewilmington.froilansfarm.Utilities.Edible;

public class Farmer extends Person implements Botanist {

    @Override
    public String makeNoise() {
        return "Hello";
    }


    @Override
    public boolean eat(Edible edible) {
        return true;
    }


    @Override
    public boolean plant(Crop crop, CropRow<Crop> cropRow) {
        return true;
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



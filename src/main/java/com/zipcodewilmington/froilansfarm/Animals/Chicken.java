package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.CropsAndProduce.EarCorn;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.EdibleEgg;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.Produce;
import com.zipcodewilmington.froilansfarm.Utilities.Edible;

public class Chicken extends ChickenAbstract implements Produce {
    boolean hasBeenFertilized;
    boolean hasBeenHarvested;
    @Override
    public String eat() {
        return "yum";
    }

    @Override
    public String makeNoise() {
        return "bawk";
    }

    @Override
    public EdibleEgg yield() {
        if(hasBeenFertilized && !hasBeenHarvested){
            hasBeenHarvested = true;
            return new EdibleEgg();
        }
        return null;
    }
}

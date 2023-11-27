package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.CropsAndProduce.EdibleEgg;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.Produce;
import com.zipcodewilmington.froilansfarm.Utilities.Edible;

public class Chicken extends ChickenAbstract implements Produce {
    boolean hasBeenFertilized;
    boolean hasBeenHarvested;

    @Override
    public EdibleEgg yield() {
        if(hasBeenFertilized && !hasBeenHarvested){
            hasBeenHarvested = true;
            return new EdibleEgg();
        }
        return null;
    }

    @Override
    public boolean eat(Edible edible) {
        return false;
    }

    @Override
    public String makeNoise() {
        return null;
    }
}

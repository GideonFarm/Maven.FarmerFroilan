package com.zipcodewilmington.froilansfarm.CropsAndProduce;

import com.zipcodewilmington.froilansfarm.Utilities.Edible;

public class TomatoPlant extends Crop {
    boolean hasBeenFertilized;
    boolean hasBeenHarvested;

    public void fertilize(){
        hasBeenFertilized = true;
    }

    public Tomato yield() {
        if(hasBeenFertilized && !hasBeenHarvested){
            hasBeenHarvested = true;
            return new Tomato();
        }
       return null;
    }
}

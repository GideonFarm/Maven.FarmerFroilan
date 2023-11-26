package com.zipcodewilmington.froilansfarm.CropsAndProduce;

public class RiceStalk extends Crop {
    boolean hasBeenFertilized;
    boolean hasBeenHarvested;

    public void fertilize(){
        hasBeenFertilized = true;
    }

    public RiceGrain yield() {
        if(hasBeenFertilized && !hasBeenHarvested){
            hasBeenHarvested = true;
            return new RiceGrain();
        }
        return null;
    }
}

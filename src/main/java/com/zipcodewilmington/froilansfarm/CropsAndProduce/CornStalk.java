package com.zipcodewilmington.froilansfarm.CropsAndProduce;

public class CornStalk extends Crop{
    boolean hasBeenFertilized;
    boolean hasBeenHarvested;

    public void fertilize(){
        hasBeenFertilized = true;
    }

    public EarCorn yield() {
        if(hasBeenFertilized && !hasBeenHarvested){
            hasBeenHarvested = true;
            return new EarCorn();
        }
        return null;
    }
}

package com.zipcodewilmington.froilansfarm.CropsAndProduce;

import com.zipcodewilmington.froilansfarm.Utilities.Edible;

public abstract class Crop implements Produce {
    boolean hasBeenHarvested = false;
    boolean hasBeenFertilized = false;


    public void fertilize(){
        hasBeenFertilized = true;
    }

    public <T extends Edible> T yield() {
        return null;
    }

}

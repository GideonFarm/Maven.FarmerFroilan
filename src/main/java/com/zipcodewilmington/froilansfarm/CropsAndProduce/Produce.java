package com.zipcodewilmington.froilansfarm.CropsAndProduce;

import com.zipcodewilmington.froilansfarm.Utilities.Edible;

public interface Produce {
    boolean hasBeenFertilized = false;
    public <T extends Edible> T yield();
}
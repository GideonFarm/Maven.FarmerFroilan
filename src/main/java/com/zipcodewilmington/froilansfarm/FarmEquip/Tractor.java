package com.zipcodewilmington.froilansfarm.FarmEquip;

import com.zipcodewilmington.froilansfarm.CropsAndProduce.Crop;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.CropRow;
import com.zipcodewilmington.froilansfarm.Housing.Farm;

public class Tractor extends TractorAbstract {

    boolean hasBeenHarvested = false;
    @Override
    public boolean operate(Farm farm) {
        return true;
    }

    @Override
    public String makeNoise() {
        return "Vroom";
    }

    public boolean harvestCrop(Crop crop){
        boolean hasBeenHarvested = true;
        return true;
    }
}

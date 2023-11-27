package com.zipcodewilmington.froilansfarm.FarmEquip;

import com.zipcodewilmington.froilansfarm.CropsAndProduce.Crop;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.CropRow;
import com.zipcodewilmington.froilansfarm.Housing.Farm;

public class Tractor extends TractorAbstract {
    @Override
    public boolean operate(Farm farm) {
        return true;
    }

    @Override
    public String makeNoise() {
        return "Vroom";
    }

//    public void harvestCrop(CropRow<Crop> crop){
    // need to add harvest Method
}

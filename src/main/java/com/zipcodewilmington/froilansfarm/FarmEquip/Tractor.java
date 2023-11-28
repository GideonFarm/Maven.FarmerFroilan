package com.zipcodewilmington.froilansfarm.FarmEquip;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Person;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.Crop;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.CropRow;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.Field;
import com.zipcodewilmington.froilansfarm.Housing.Farm;

public class Tractor extends TractorAbstract {

    boolean hasBeenHarvested = false;

    @Override
    public String makeNoise() {
        return "Vroom";
    }

    public boolean harvestCrop(Crop crop, CropRow<Crop> cropRow){
        boolean hasBeenHarvested = true;
        return true;
    }
    @Override
    public boolean operate(Person person, Field field) {
        return true;
    }
}

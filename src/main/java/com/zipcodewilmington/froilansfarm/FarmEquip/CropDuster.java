package com.zipcodewilmington.froilansfarm.FarmEquip;

import com.zipcodewilmington.froilansfarm.Animals.Person;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.Crop;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.CropRow;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.Field;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Housing.Farm;

public class CropDuster extends CropDusterAbstract {
    @Override
    public String fly() {
        return "flying";
    }


    @Override
    public String makeNoise() {
        return "Vroom";
    }

//    public boolean fertilize(){
//        return true; // need to fix method with Crop, CropRow
    public boolean fertilize(CropRow<Crop>cropRow) {
        return true;
    }

    @Override
    public boolean operate(Person person, Field field) {
        return true;
    }
}


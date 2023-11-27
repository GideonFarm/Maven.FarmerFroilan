package com.zipcodewilmington.froilansfarm.FarmEquip;

import com.zipcodewilmington.froilansfarm.Housing.Farm;

public class CropDuster extends CropDusterAbstract {
    @Override
    public String fly() {
        return "flying";
    }

    @Override
    public boolean operate(Farm farm) {
        return true;
    }

    @Override
    public String makeNoise() {
        return "Vroom";
    }

//    public boolean fertilize(){
//        return true; // need to fix method with Crop, CropRow

}

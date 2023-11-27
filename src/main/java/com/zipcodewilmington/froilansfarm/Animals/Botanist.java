package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.CropsAndProduce.Crop;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.CropRow;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.Field;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Utilities.Edible;

public interface Botanist {

    public boolean plant(Crop crop, CropRow<Crop> cropRow);


 }


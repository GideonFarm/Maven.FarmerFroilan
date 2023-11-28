package com.zipcodewilmington.froilansfarm.FarmEquip;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.Field;
import com.zipcodewilmington.froilansfarm.Housing.Farm;


public interface FarmVehicle {

    boolean operate (Farmer farmer, Field field);
}

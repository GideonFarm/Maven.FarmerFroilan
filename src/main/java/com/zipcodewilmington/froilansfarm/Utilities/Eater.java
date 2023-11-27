package com.zipcodewilmington.froilansfarm.Utilities;

public interface Eater <FoodType extends Edible>{

    public boolean eat(FoodType edible);
}

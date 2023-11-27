package com.zipcodewilmington.froilansfarm.Utilities;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Housing.Farm;
import com.zipcodewilmington.froilansfarm.Housing.Storage;
import org.junit.Assert;
import org.junit.Test;

public class StorageTest {

    @Test
    public void testAddHorse(){
        Horse horse = new Horse();
        Storage stable = new Storage();

        stable.addHorse(horse);

        Assert.assertNotNull(stable);
    }

    @Test
    public void testAddChicken(){
        Chicken chicken = new Chicken();
        Storage ChickenCoop = new Storage();
        ChickenCoop.addChicken(chicken);

        Assert.assertNotNull(ChickenCoop);
    }

    @Test
    public void testAddPerson(){
        Farmer fred = new Farmer();
        Storage house = new Storage();

        house.addPerson(fred);
        Assert.assertNotNull(house);
    }
}

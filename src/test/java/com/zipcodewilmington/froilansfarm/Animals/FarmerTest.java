package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.CropsAndProduce.*;
import com.zipcodewilmington.froilansfarm.Housing.Farm;
import com.zipcodewilmington.froilansfarm.Utilities.Edible;
import com.zipcodewilmington.froilansfarm.Utilities.Rideable;
import com.zipcodewilmington.froilansfarm.Utilities.Rider;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void testNewFarmer(){
        Farmer Frolian = new Farmer();
        Assert.assertNotNull(Frolian);
    }
    @Test
    public void testFarmerIsBotanist(){
        Farmer Frolian = new Farmer();
        Assert.assertTrue(Frolian instanceof Botanist);
    }

    @Test
    public void testFarmerIsPerson(){
        Farmer Frolian = new Farmer();
        Assert.assertTrue(Frolian instanceof Person);
    }
    @Test
    public void testFarmerIsRider(){
        Farmer Frolian = new Farmer();
        Assert.assertTrue(Frolian instanceof Rider);
    }

    @Test
    public void testFarmerPlant(){
        Farmer Frolian = new Farmer();
        TomatoPlant corn = new TomatoPlant();
        CropRow<Crop> plant = new CropRow<>();

        Assert.assertTrue(Frolian.plant(corn, plant));

    }
    @Test
    public void testMountHorse(){
        Farmer Frolian = new Farmer();
        Horse horse = new Horse();
        Assert.assertTrue(Frolian.mount(horse));
    }

    @Test
    public void testDismountHorse(){
        Farmer Frolian = new Farmer();
        Horse horse = new Horse();
        Assert.assertTrue(Frolian.dismount(horse));
    }

    @Test
    public void testRideable() {
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Rideable);
    }

    @Test
    public void testEat(){
        Farmer farmer = new Farmer();
        Edible tomato = new Tomato();
        Assert.assertTrue(farmer.eat(tomato));
    }

    @Test
    public void testNoise(){
        Farmer farmer = new Farmer();
        String expected = "Hello";
        String actual = farmer.makeNoise();

        Assert.assertEquals(expected, actual);
    }
}


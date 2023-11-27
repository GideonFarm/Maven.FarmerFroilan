package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.CropsAndProduce.*;
import com.zipcodewilmington.froilansfarm.Housing.Farm;
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
}

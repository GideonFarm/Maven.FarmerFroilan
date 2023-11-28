package com.zipcodewilmington.froilansfarm.FarmEquip;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.*;
import com.zipcodewilmington.froilansfarm.Housing.Farm;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void testOperate(){
        Tractor tract = new Tractor();
        Farmer farmer = new Farmer();
        Field field = new Field();
        Assert.assertTrue(tract.operate(farmer, field));
    }

    @Test
    public void testNoise(){
        Tractor tract = new Tractor();
        String expected = "Vroom";
        String actual = tract.makeNoise();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testHarvest(){
        Tractor tractor = new Tractor();
        Crop tomato = new TomatoPlant();

        tractor.harvestCrop(tomato);

        Assert.assertTrue(tractor.harvestCrop(tomato));



    }
}

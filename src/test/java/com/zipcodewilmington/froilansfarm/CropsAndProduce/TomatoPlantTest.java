package com.zipcodewilmington.froilansfarm.CropsAndProduce;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TomatoPlantTest {
    @Test
    public void testYield(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();
        Tomato tomato = tomatoPlant.yield();
        assertEquals(Tomato.class, tomato.getClass());
    }
}

package com.zipcodewilmington.froilansfarm.CropsAndProduce;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiceStalkTest {
    @Test
    public void testYield(){
        RiceStalk riceStalk = new RiceStalk();
        riceStalk.fertilize();
        RiceGrain riceGrain = riceStalk.yield();
        assertEquals(RiceGrain.class, riceGrain.getClass());
    }
}

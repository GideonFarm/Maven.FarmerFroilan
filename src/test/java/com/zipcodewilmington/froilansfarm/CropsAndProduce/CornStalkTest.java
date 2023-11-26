package com.zipcodewilmington.froilansfarm.CropsAndProduce;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CornStalkTest {
    @Test
    public void testYield(){
        CornStalk cornStalk = new CornStalk();
        cornStalk.fertilize();
        EarCorn earCorn = cornStalk.yield();
        assertEquals(EarCorn.class, earCorn.getClass());
    }
}

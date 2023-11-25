package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.CropsAndProduce.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void testMakeNoise(){
        Chicken chicken = new Chicken();
        String expected = "bawk";
        String actual = chicken.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEat(){
        Chicken chicken = new Chicken();
        EarCorn food = new EarCorn();
        String expected ="yum";
        String actual = chicken.eat();
    }

}

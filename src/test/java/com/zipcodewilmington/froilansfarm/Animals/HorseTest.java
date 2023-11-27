package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.CropsAndProduce.CornStalk;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.EarCorn;
import com.zipcodewilmington.froilansfarm.Utilities.Edible;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void testMakeNoise(){
        Horse horse = new Horse();
        String expected = "neigh";
        String actual = horse.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEat(){
        Horse horse = new Horse();
        Edible EarCorn = new EarCorn();
        horse.eat(EarCorn);
    }


}

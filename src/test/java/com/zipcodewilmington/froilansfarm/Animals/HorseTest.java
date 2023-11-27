package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.CropsAndProduce.CornStalk;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.EarCorn;
import com.zipcodewilmington.froilansfarm.Utilities.Edible;
import com.zipcodewilmington.froilansfarm.Utilities.Rideable;
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

    @Test
    public void testAnimal(){
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void testRideable(){
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Rideable);
    }


}

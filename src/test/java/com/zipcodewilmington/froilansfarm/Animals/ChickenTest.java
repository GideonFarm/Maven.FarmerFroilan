package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.CropsAndProduce.EarCorn;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.EdibleEgg;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.Produce;
import com.zipcodewilmington.froilansfarm.Utilities.Edible;
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
        Edible earcorn = new EarCorn();
        chicken.eat(earcorn);
    }

    @Test
    public void testProduceChicken(){
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Produce);
    }

    @Test
    public void testAnimal(){
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void testYield(){
        Chicken chicken = new Chicken();
        EdibleEgg egg = new EdibleEgg();
        chicken.hasBeenFertilized = true;
        chicken.hasBeenHarvested = true;
        chicken.yield();
        Assert.assertNull(chicken.yield());
    }

}

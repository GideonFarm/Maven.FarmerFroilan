package com.zipcodewilmington.froilansfarm.DailySchedule;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.EarCorn;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.EdibleEgg;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class WednesdayTest {
    @Test
    public void wednesdayTest(){
        Farmer Froilan = new Farmer();
        Pilot Froilanda = new Pilot();

        Chicken chicken = new Chicken();
        Horse horse = new Horse();
        Horse horse1 = new Horse();

        chicken.yield(); // Edible Egg

        EdibleEgg egg1 = new EdibleEgg();
        Tomato tomato = new Tomato();
        EarCorn corn = new EarCorn();

        // NOISY WEDNESDAY

        String actual = Froilan.makeNoise();
        String expected ="Hello";

        String actual1 = Froilanda.makeNoise();
        String expected1= "Hello";

        String actual2 = horse.makeNoise();
        String expected2 = "neigh";

        String actual3 = chicken.makeNoise();
        String expected3= "bawk";

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);

        Assert.assertTrue(horse.eat(corn));
        Assert.assertTrue(Froilanda.eat(egg1));
        Assert.assertTrue(Froilan.eat(tomato));

        Assert.assertTrue(Froilanda.mount(horse));
        Assert.assertTrue(Froilan.mount(horse1));

        Assert.assertTrue(Froilanda.dismount(horse));
        Assert.assertTrue(Froilan.dismount(horse1));

    }
}

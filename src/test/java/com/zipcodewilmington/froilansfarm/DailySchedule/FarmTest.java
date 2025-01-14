package com.zipcodewilmington.froilansfarm.DailySchedule;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.EarCorn;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.EdibleEgg;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.Tomato;
import com.zipcodewilmington.froilansfarm.Housing.Storage;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FarmTest {
    @Test
    public void farmEatTest() {
        Farmer Froilan = new Farmer();
        EdibleEgg egg1 = new EdibleEgg();
        EdibleEgg egg2 = new EdibleEgg();
        EdibleEgg egg3 = new EdibleEgg();
        EdibleEgg egg4 = new EdibleEgg();
        EdibleEgg egg5 = new EdibleEgg();
        Tomato tomato1 = new Tomato();
        Tomato tomato2 = new Tomato();
        EarCorn earCorn = new EarCorn();

        // Given
        Froilan.eat(egg1);
        Froilan.eat(egg2);
        Froilan.eat(egg3);
        Froilan.eat(egg4);
        Froilan.eat(egg5);
        Froilan.eat(tomato1);
        Froilan.eat(tomato2);
        Froilan.eat(earCorn);

        // When
        assertTrue(Froilan.eat(egg2));
        assertTrue(Froilan.eat(egg3));
        assertTrue(Froilan.eat(egg4));
        assertTrue(Froilan.eat(egg5));
        assertTrue(Froilan.eat(tomato1));
        assertTrue(Froilan.eat(tomato2));
        assertTrue(Froilan.eat(earCorn));
    }

    @Test
    public void pilotEatTest() {
        //Given
        Pilot Froilanda = new Pilot();
        EdibleEgg egg1 = new EdibleEgg();
        EdibleEgg egg2 = new EdibleEgg();
        Tomato tomato = new Tomato();
        EarCorn earCorn1 = new EarCorn();
        EarCorn earCorn2 = new EarCorn();

        // When
        Froilanda.eat(egg1);
        Froilanda.eat(egg2);
        Froilanda.eat(tomato);
        Froilanda.eat(earCorn1);
        Froilanda.eat(earCorn2);

        // Then
        assertTrue(Froilanda.eat(egg1));
        assertTrue(Froilanda.eat(egg2));
        assertTrue(Froilanda.eat(tomato));
        assertTrue(Froilanda.eat(earCorn1));
        assertTrue(Froilanda.eat(earCorn2));
    }

    @Test
    public void farmerRideTest() {
        //Given
        Farmer Froilan = new Farmer();
        Horse horse = new Horse();
        //When
        boolean result = Froilan.mount(horse);
        //The
        assertEquals(true, result);
    }

    @Test
    public void horseinStable(){
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();

        Storage stable = new Storage();

        stable.addHorse(horse1);
        stable.addHorse(horse2);
        stable.addHorse(horse3);

        int expected = 3;

        Assert.assertEquals(expected, stable.getStableSize());
    }

    @Test
    public void pilotRideTest() {
        //Given
        Pilot Froilanda = new Pilot();
        Horse horse = new Horse();
        //When
        boolean result = Froilanda.mount(horse);
        //The
        assertEquals(true, result);
    }



}


package com.zipcodewilmington.froilansfarm.CropsAndProduce;

import org.junit.Assert;
import org.junit.Test;

public class SiloTest {
    @Test
    public void testAddTomato() {
        Tomato tomato = new Tomato();
        Silo silo = new Silo();

        silo.addTomato(tomato);

        Assert.assertNotNull(silo);
    }
    @Test
    public void testAddEarCorn() {
        EarCorn earCorn = new EarCorn();
        Silo silo = new Silo();

        silo.addEarCorn(earCorn);

        Assert.assertNotNull(silo);
    }
    @Test
    public void testAddRiceGrain() {
        RiceGrain riceGrain = new RiceGrain();
        Silo silo = new Silo();

        silo.addRiceGrain(riceGrain);

        Assert.assertNotNull(silo);
    }
}
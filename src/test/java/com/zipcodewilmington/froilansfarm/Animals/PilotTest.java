package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.CropsAndProduce.Tomato;
import com.zipcodewilmington.froilansfarm.FarmEquip.CropDuster;
import com.zipcodewilmington.froilansfarm.Utilities.Edible;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    @Test
    public void testEat(){
        Pilot anne = new Pilot();
        Edible tomato = new Tomato();
        Assert.assertTrue(anne.eat(tomato));
    }

    @Test
    public void testNoise(){
        Pilot anne = new Pilot();
        String expected = "Hello";
        String actual = anne.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMount(){
        Pilot anne = new Pilot();
        CropDuster dust = new CropDuster();
        Assert.assertTrue(anne.mount(dust));
    }
    @Test
    public void testDismount() {
        Pilot anne = new Pilot();
        CropDuster dust = new CropDuster();
        Assert.assertTrue(anne.dismount(dust));
    }
}

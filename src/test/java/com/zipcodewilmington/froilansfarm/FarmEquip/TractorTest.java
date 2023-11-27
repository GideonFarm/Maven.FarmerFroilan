package com.zipcodewilmington.froilansfarm.FarmEquip;

import com.zipcodewilmington.froilansfarm.Housing.Farm;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void testOperate(){
        Tractor tract = new Tractor();
        Farm farm = new Farm();
        Assert.assertTrue(tract.operate(farm));
    }

    @Test
    public void testNoise(){
        Tractor tract = new Tractor();
        String expected = "Vroom";
        String actual = tract.makeNoise();

        Assert.assertEquals(expected, actual);
    }
}

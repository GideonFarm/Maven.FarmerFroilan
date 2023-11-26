package com.zipcodewilmington.froilansfarm.FarmEquip;

import com.zipcodewilmington.froilansfarm.CropsAndProduce.CornStalk;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.Field;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FieldTest {
    @Test
    public void testField(){
        Field field = new Field();
        assertEquals(5, field.size());
    }
}

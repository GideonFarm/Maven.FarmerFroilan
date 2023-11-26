package com.zipcodewilmington.froilansfarm.FarmEquip;

import com.zipcodewilmington.froilansfarm.CropsAndProduce.CornStalk;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.CropRow;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CropRowTest {
    @Test
    public void testCropRow(){
        CropRow<CornStalk> cropRow = new CropRow<>();
        cropRow.plant(new CornStalk());
        assertEquals(1,cropRow.size());
    }
}

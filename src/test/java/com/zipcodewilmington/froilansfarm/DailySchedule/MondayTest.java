package com.zipcodewilmington.froilansfarm.DailySchedule;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.CropRow;
import com.zipcodewilmington.froilansfarm.FarmEquip.CropDuster;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MondayTest {

    @Test
    public void mondayTest() {
        //Given
        Pilot Froilanda = new Pilot();
        CropDuster cropDuster = new CropDuster();
        //When
        Object cropduster;
        boolean result = Froilanda.fly(cropduster);
        //The
        assertEquals(true, result);

    }

    @Test
    public void pilotFertilize() {
        //Given
        Pilot Froilanda = new Pilot();
        CropRow cropRow = new CropRow();
        //When
        boolean result = Froilanda.fertilize(cropRow);
        //The
        assertEquals(true, result);
    }
}

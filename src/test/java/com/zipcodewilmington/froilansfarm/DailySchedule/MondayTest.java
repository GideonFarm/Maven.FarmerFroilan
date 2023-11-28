package com.zipcodewilmington.froilansfarm.DailySchedule;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.Crop;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.CropRow;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.FarmEquip.CropDuster;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MondayTest {

    @Test
    public void mondayTest() {
        //Given
        Pilot Froilanda = new Pilot();
        CropDuster cropDuster = new CropDuster();
        //When
        boolean result = Froilanda.mount(cropDuster);

        String expected = "flying";
        String actual = cropDuster.fly();
        //The
        assertEquals(true, result);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void pilotFertilize() {
        //Given
        Pilot Froilanda = new Pilot();
        CropRow cropRow = new CropRow();

        Crop tomato = new TomatoPlant();
        cropRow.plant(tomato);

        CropDuster cropDuster = new CropDuster();

        Froilanda.mount(cropDuster);
        //When
        boolean result = cropDuster.fertilize(cropRow);
        //The
        assertEquals(true, result);
    }
}

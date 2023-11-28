package com.zipcodewilmington.froilansfarm.DailySchedule;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.CropRow;
import com.zipcodewilmington.froilansfarm.FarmEquip.CropDuster;
import com.zipcodewilmington.froilansfarm.FarmEquip.Tractor;
import com.zipcodewilmington.froilansfarm.Housing.Farm;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TuesdayTest {
    @Test
    public void tuesdayTest() {
        //Given
        Farmer Froilan = new Farmer();
        Tractor tractor = new Tractor();
        //When
        boolean result = Froilan.mount(tractor);
        //The
        assertEquals(true, result);

    }

    @Test
    public void tuesdayHarvestTest() {
        //Given
        Farmer Froilan = new Farmer();
        Tractor tractor = new Tractor();
        CropRow cropRow = new CropRow();
        //When
        boolean result = Froilan.harvest(cropRow);
        //The
        assertEquals(true, result);
}

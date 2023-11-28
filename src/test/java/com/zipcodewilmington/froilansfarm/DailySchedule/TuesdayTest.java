package com.zipcodewilmington.froilansfarm.DailySchedule;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.CornStalk;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.Crop;
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
        Crop cornStalk = new CornStalk();
        //When
        boolean result = tractor.harvestCrop(cornStalk, cropRow);
        //Then
        assertEquals(true, result);
    }
}

/*import com.zipcodewilmington.froilansfarm.CropsAndProduce.*;
import com.zipcodewilmington.froilansfarm.FarmEquip.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TuesdayTest {
    @Test
    public void tuesdayTest(){
        Farmer Froilan = new Farmer();
        Tractor tractor = new Tractor();
        Crop tomatoPlant = new TomatoPlant();
        Crop cornStalk = new CornStalk();
        Crop riceStalk = new RiceStalk();


        CropRow<Crop> tomato = new CropRow<>();
        CropRow<Crop> corn = new CropRow<>();
        CropRow<Crop> rice = new CropRow<>();

        Froilan.mount(tractor);

        String actual = Froilan.makeNoise();
        String expected = "Hello";

        String actual1 = tractor.makeNoise();
        String expected1 = "Vroom";

        tractor.harvestCrop(tomatoPlant,tomato);
        tractor.harvestCrop(cornStalk, corn);
        tractor.harvestCrop(riceStalk, rice);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected, actual);


        Assert.assertTrue(tractor.harvestCrop(tomatoPlant, tomato));
        Assert.assertTrue(tractor.harvestCrop(cornStalk, corn));
        Assert.assertTrue(tractor.harvestCrop(riceStalk, rice));





    }*/


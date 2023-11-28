package com.zipcodewilmington.froilansfarm.DailySchedule;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.*;
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





    }
}

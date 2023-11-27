package com.zipcodewilmington.froilansfarm.FarmEquip;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.*;
import com.zipcodewilmington.froilansfarm.Housing.Farm;
import com.zipcodewilmington.froilansfarm.Utilities.Rideable;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CropDusterTest {

    @Test
    public void testCropDuster(){
        CropDuster duster = new CropDuster();
        Assert.assertNotNull(duster);
    }

    @Test
    public void testNoise(){
        CropDuster duster = new CropDuster();
        String expected = "Vroom";
        String actual = duster.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOperate(){
        CropDuster duster = new CropDuster();
        Farm farm = new Farm();
        Assert.assertTrue(duster.operate(farm));

    }

    @Test
    public void testFly(){
        CropDuster duster = new CropDuster();
        String expected = "flying";
        String actual = duster.fly();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testVehicle(){
        CropDuster duster = new CropDuster();

        Assert.assertTrue(duster instanceof Vehicle);
    }

    @Test
    public void testAircraft(){
        CropDuster duster = new CropDuster();

        Assert.assertTrue(duster instanceof Aircraft);
    }

    @Test
    public void testRideable(){
        CropDuster duster = new CropDuster();

        Assert.assertTrue(duster instanceof Rideable);
    }
    @Test
    public void testFarmVehicle(){
        CropDuster duster = new CropDuster();

        Assert.assertTrue(duster instanceof FarmVehicle);
    }

    @Test
    public void testFertilize(){
        CropDuster dust = new CropDuster();
        CropRow<Crop> crop = new CropRow<>();

        Assert.assertTrue(dust.fertilize(crop));
    }

    @Test
    public void testCropCropRow(){
        CropDuster dust = new CropDuster();
        Crop tomatoPlant= new TomatoPlant();
        Crop cornStalk = new CornStalk();
        Tomato tomato = new Tomato();
        Farmer fren = new Farmer();
        Pilot pilo = new Pilot();

        Silo store = new Silo();
        store.addTomato(tomato);
        CropRow<Crop> crop = new CropRow<>();
        crop.plant(tomatoPlant);
        crop.plant(cornStalk);
        pilo.mount(dust);
        fren.plant(tomatoPlant, crop);

        Assert.assertTrue(dust.fertilize(crop));
        Assert.assertNotNull(crop);

    }

}

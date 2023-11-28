package com.zipcodewilmington.froilansfarm.DailySchedule;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.CropsAndProduce.*;
import org.junit.Assert;
import org.junit.Test;

public class SundayTest {

    @Test
    public void sundayTest() {
        //Given
        Farmer Froilan = new Farmer();
        Crop tomatoPlant = new TomatoPlant();
        Crop riceStalk = new RiceStalk();
        Crop cornStalk = new CornStalk();
        //When
        Froilan.plant(tomatoPlant, new CropRow<>());
        Froilan.plant(riceStalk, new CropRow<>());
        Froilan.plant(cornStalk, new CropRow<>());
        //Then
        Assert.assertTrue(Froilan.plant(tomatoPlant, new CropRow<>()));
        Assert.assertTrue(Froilan.plant(riceStalk, new CropRow<>()));
        Assert.assertTrue(Froilan.plant(cornStalk, new CropRow<>()));
    }
}


/*import com.zipcodewilmington.froilansfarm.CropsAndProduce.*;
import org.junit.Assert;
import org.junit.Test;

public class SundayTest {*/
 /*   @Test
    public void sundayTest(){
        Farmer Froilan = new Farmer();
        Crop tomatoPlant = new TomatoPlant();
        Crop riceStalk = new RiceStalk();
        Crop cornStalk = new CornStalk();

        CropRow<Crop> firstRow = new CropRow<>();
        CropRow<Crop> rice = new CropRow<>();
        CropRow<Crop> corn = new CropRow<>();

        Froilan.plant(tomatoPlant, firstRow);
        Froilan.plant(riceStalk, rice);
        Froilan.plant(cornStalk, corn);


        Assert.assertTrue(Froilan.plant(tomatoPlant, firstRow));
        Assert.assertTrue(Froilan.plant(riceStalk, rice));
        Assert.assertTrue(Froilan.plant(cornStalk, corn));
        */

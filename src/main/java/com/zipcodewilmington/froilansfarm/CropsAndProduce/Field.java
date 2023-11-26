package com.zipcodewilmington.froilansfarm.CropsAndProduce;

public class Field {
    CropRow<?>[] field;

    public Field() {
        this.field = new CropRow[5];
        CropRow<CornStalk> cornRow = new CropRow<>();
        field[0] = cornRow;
        CropRow<TomatoPlant> tomatoRow = new CropRow<>();
        field[1] = tomatoRow;
        CropRow<RiceStalk> riceRow1 = new CropRow<>();
        field[2] = riceRow1;
        CropRow<RiceStalk> riceRow2 = new CropRow<>();
        field[3] = riceRow2;
        CropRow<RiceStalk> riceRow3 = new CropRow<>();
        field[4] = riceRow3;
    }

    public int size(){
        return field.length;
    }
}

package com.zipcodewilmington.froilansfarm.CropsAndProduce;

import java.util.ArrayList;
import java.util.List;

public class CropRow<T extends Crop> {

    List<T> cropRow;

    public CropRow() {
        this.cropRow = new ArrayList<>();
    }

    public void plant(T crop) {
        cropRow.add(crop);
    }
    public int size(){
        return cropRow.size();
    }

}

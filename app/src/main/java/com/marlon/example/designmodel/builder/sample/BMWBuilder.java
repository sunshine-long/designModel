package com.marlon.example.designmodel.builder.sample;

import java.util.ArrayList;

/**
 * Created by kanglong on 2017/11/19.
 */

public class BMWBuilder extends CarBuilder {
    BMWModel bmwModel  = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}

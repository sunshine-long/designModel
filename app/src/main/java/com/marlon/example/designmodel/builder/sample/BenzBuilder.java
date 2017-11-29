package com.marlon.example.designmodel.builder.sample;

import java.util.ArrayList;

/**
 * Created by kanglong on 2017/11/19.
 */

public class BenzBuilder extends CarBuilder {
    BenzModel benzModel = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}

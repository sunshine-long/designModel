package com.marlon.example.designmodel.builder.sample;

import java.util.ArrayList;

/**
 * Created by kanglong on 2017/11/19.
 */

public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);
    public abstract CarModel getCarModel();
}

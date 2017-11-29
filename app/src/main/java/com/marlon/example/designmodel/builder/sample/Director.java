package com.marlon.example.designmodel.builder.sample;

import java.util.ArrayList;

/**
 * Created by kanglong on 2017/11/19.
 */

public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();


    public CarModel getBenzModel(){
        sequence.clear();
        sequence.add("start");
        sequence.add("stop");
        sequence.add("alarm");
        benzBuilder.setSequence(sequence);
        return benzBuilder.getCarModel();
    }

    public CarModel getBmwBuilder() {
        sequence.clear();
        sequence.add("start");
        sequence.add("stop");
        sequence.add("engine Boom");
        bmwBuilder.setSequence(sequence);
        return bmwBuilder.getCarModel();
    }
}

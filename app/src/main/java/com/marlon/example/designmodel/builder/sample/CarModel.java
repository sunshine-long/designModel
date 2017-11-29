package com.marlon.example.designmodel.builder.sample;

import java.util.ArrayList;

/**
 * Created by kanglong on 2017/11/19.
 */

public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        for (String s : sequence) {
            switch (s) {
                case "start":
                    this.start();
                    break;
                case "stop":
                    this.stop();
                    break;
                case "alarm":
                    this.alarm();
                    break;
                case "engine Boom":
                    this.engineBoom();
                    break;
                default:
                    break;

            }
        }
    }

    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}

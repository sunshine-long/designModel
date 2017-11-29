package com.marlon.example.designmodel.builder.sample;

import android.util.Log;

/**
 *
 * @author kanglong
 * @date 2017/11/19
 */

public class BMWModel extends CarModel {
    private static final String TAG = "CarModel";
    @Override
    protected void start() {
        Log.d(TAG,TAG+"start");
    }

    @Override
    protected void stop() {
        Log.d(TAG,TAG+"stop");
    }

    @Override
    protected void alarm() {
        Log.d(TAG,TAG+"alarm");
    }

    @Override
    protected void engineBoom() {
        Log.d(TAG,TAG+"engineBoom");
    }
}

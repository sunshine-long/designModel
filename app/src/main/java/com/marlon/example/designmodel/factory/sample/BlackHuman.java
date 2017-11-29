package com.marlon.example.designmodel.factory.sample;

import android.util.Log;

/**
 * Created by kanglong on 2017/11/23.
 */

public class BlackHuman extends Human {
    private static final String TAG = "BlackHuman";
    @Override
    public void getColor() {
        Log.d(TAG, "getColor: " + "黑色人种的皮肤是黑色的");
    }

    @Override
    public void talk() {
        Log.d(TAG, "talk: " + "黑人说话一般人听不懂");
    }
}

package com.marlon.example.designmodel.factory.sample;

import android.util.Log;

/**
 *
 * @author kanglong
 * @date 2017/11/23
 */

public class YellowHuman implements Human {
    private static final String TAG = "YellowHuman";
    @Override
    public void getColor() {
        Log.d(TAG, "getColor: " + "黄种人种的皮肤是黄色的");
    }

    @Override
    public void talk() {
        Log.d(TAG, "talk: " + "黄种人说话一般都是双字节的");
    }
}

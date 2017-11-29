package com.marlon.example.designmodel.factory.sample;

import android.util.Log;

/**
 * Created by kanglong on 2017/11/23.
 */

public class WhiteHuman implements Human {
    private static final String TAG = "WhiteHuman";
    @Override
    public void getColor() {
        Log.d(TAG, "getColor: " + "白种人种的皮肤是白色的");
    }

    @Override
    public void talk() {
        Log.d(TAG, "talk: " + "白种人说话一般都是单字节的所以听得不是很懂哟");
    }
}

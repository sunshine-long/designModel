package com.marlon.example.designmodel.factory.test;

import android.util.Log;

/**
 * Created by kanglong on 2017/11/23.
 */

public class MacBook extends Computer {

    @Override
    public void typing() {
        Log.d(TAG, "typing: 用美式键盘打字啊");
    }

    @Override
    public void serashWeb() {
        Log.d(TAG, "serashWeb: 用saferi浏览网页啊");
    }

    @Override
    public void system() {
        Log.d(TAG, "system: 用的是MacOSX系统呀");

    }
}

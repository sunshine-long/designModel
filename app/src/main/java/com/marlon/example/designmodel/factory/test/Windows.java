package com.marlon.example.designmodel.factory.test;

import android.util.Log;

/**
 * Created by kanglong on 2017/11/23.
 */

public class Windows extends Computer {

    @Override
    public void typing() {
        Log.d(TAG, "typing: 用手都输入法打字啊");
    }

    @Override
    public void serashWeb() {
        Log.d(TAG, "serashWeb: 用的是QQ浏览器了呀");
    }

    @Override
    public void system() {
        Log.d(TAG, "system: 我的是用的win 10 了哈 ");
    }
}

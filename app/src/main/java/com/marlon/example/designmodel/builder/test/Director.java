package com.marlon.example.designmodel.builder.test;

/**
 * Created by kanglong on 2017/11/19.
 */

public class Director {
    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String mBosrd,String mDisplay){
        builder.setmBosrd(mBosrd);
        builder.setmDisplay(mDisplay);
        builder.setmOS();
    }
}

package com.marlon.example.designmodel.builder.test;

/**
 * Created by kanglong on 2017/11/19.
 */

public abstract class Computer {
    protected String mBosrd;
    protected String mDisplay;
    protected String mOS;

    public void setmBosrd(String mBosrd) {
        this.mBosrd = mBosrd;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void setmOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mBosrd='" + mBosrd + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}

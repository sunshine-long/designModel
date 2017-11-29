package com.marlon.example.designmodel.builder.test;

/**
 * Created by kanglong on 2017/11/19.
 */

public abstract class Builder {
    public abstract void  setmBosrd(String mBosrd);
    public abstract void setmDisplay(String mBosrd);
    public abstract void setmOS();

    public abstract Computer getComputer();
}

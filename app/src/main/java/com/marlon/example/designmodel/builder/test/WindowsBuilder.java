package com.marlon.example.designmodel.builder.test;

/**
 * Created by kanglong on 2017/11/19.
 */

public class WindowsBuilder extends Builder {
    Windows windows = new Windows();

    @Override
    public void setmBosrd(String mBosrd) {
        windows.setmBosrd(mBosrd);
    }

    @Override
    public void setmDisplay(String mBosrd) {
        windows.setmDisplay(mBosrd);
    }

    @Override
    public void setmOS() {
        windows.setmOS();
    }

    @Override
    public Computer getComputer() {
        return windows;
    }
}

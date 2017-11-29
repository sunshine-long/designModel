package com.marlon.example.designmodel.builder.test;

/**
 * Created by kanglong on 2017/11/19.
 */

public class MacBookBuilder extends Builder {
    MacBook macBook = new MacBook();

    @Override
    public void setmBosrd(String mBosrd) {
        macBook.setmBosrd(mBosrd);
    }

    @Override
    public void setmDisplay(String mBosrd) {
        macBook.setmDisplay(mBosrd);
    }

    @Override
    public void setmOS() {
        macBook.setmOS();
    }

    @Override
    public Computer getComputer() {
        return macBook;
    }
}

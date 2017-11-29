package com.marlon.example.designmodel.factory.test;

/**
 * Created by kanglong on 2017/11/23.
 */

public class ComputerFactory extends AbstractComputerFactory {
    @Override
    public <T extends Computer> T creactComputer(Class<T> c) {
        Computer computer = null;
        try {
            computer = (Computer) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)computer;
    }
}

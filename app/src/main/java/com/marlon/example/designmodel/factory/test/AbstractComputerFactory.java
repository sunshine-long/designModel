package com.marlon.example.designmodel.factory.test;

/**
 * Created by kanglong on 2017/11/23.
 */

public abstract class AbstractComputerFactory {
   public abstract  <T extends Computer> T creactComputer(Class<T> c);
}

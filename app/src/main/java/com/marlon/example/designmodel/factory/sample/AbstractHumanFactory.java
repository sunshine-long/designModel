package com.marlon.example.designmodel.factory.sample;

/**
 *
 * @author kanglong
 * @date 2017/11/23
 */

public abstract class AbstractHumanFactory {
    /**
     *
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends  Human>  T creactHuman(Class<T> c);
}

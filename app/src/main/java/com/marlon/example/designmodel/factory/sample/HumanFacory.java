package com.marlon.example.designmodel.factory.sample;

/**
 * Created by kanglong on 2017/11/23.
 */

public class HumanFacory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T creactHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}

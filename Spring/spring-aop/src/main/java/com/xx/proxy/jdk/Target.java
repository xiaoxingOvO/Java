package com.xx.proxy.jdk;

/**
 * @author xiaoxing
 * @create 2022-05-01 17:01
 */
public class Target implements TargetInterface {

    @Override
    public void save() {
        System.out.println("save");
    }
}

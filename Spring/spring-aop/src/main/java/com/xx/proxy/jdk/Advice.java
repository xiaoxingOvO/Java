package com.xx.proxy.jdk;

/**
 * @author xiaoxing
 * @create 2022-05-01 17:02
 */
public class Advice {

    public void before(){
        System.out.println("前置增强");
    }

    public void after(){
        System.out.println("后置增强");
    }
}

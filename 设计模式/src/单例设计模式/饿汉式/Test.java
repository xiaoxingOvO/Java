package 单例设计模式.饿汉式;

import 单例设计模式.饿汉式.Singleton;
import 单例设计模式.饿汉式.Singleton1;

/**
 * 获取实例测试
 * @author xiaoxing
 * @create 2021-12-17 11:40
 */
public class Test {
    public static void main(String[] args) {
        //得到Singleton类的实例
        Singleton singleton = Singleton.getInstance();
        System.out.println("singleton: " + singleton);

        //得到Singleton1的实例
        Singleton1 singleton1 = Singleton1.INSTANCE;
        System.out.println("singleton1: " + singleton1);

    }
}

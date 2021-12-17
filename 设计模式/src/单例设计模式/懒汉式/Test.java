package 单例设计模式.懒汉式;

import javax.lang.model.SourceVersion;

/**
 * @author xiaoxing
 * @create 2021-12-17 12:26
 */
public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("singleton = " + singleton);
    }
}

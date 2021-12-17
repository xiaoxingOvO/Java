package 单例设计模式.懒汉式;

/**
 * 线程不安全-加个锁变安全
 * @author xiaoxing
 * @create 2021-12-17 12:24
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){};

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

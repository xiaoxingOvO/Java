package 单例设计模式.懒汉式;

/**
 * 线程安全
 * @author xiaoxing
 * @create 2021-12-17 12:27
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1(){};

    public static synchronized Singleton1 getInstance(){
        //如果已经有了实例对象,就不比等待锁了
        if (instance == null){
            //用锁是为了解决没有实例对象时,有多个线程同时访问想要创建实例对象,造成的多次创建
            synchronized (Singleton1.class){
                if (instance == null){
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }

}

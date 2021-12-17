package 单例设计模式.饿汉式;

/**
 * 饿汉式-直接实例化实现(线程安全):
 * 1.一个私有构造函数 （确保只能单例类自己创建实例）
 * 2.一个私有静态变量 （确保只有一个实例）
 * 3.一个公有静态函数 （向外提供这个实例）
 * @author xiaoxing
 * @create 2021-12-17 11:18
 */
public class Singleton {

    //私有静态变量
    private static Singleton instance = new Singleton();

    //私有化构造方法
    private Singleton(){

    }

    //公有静态函数
    public static Singleton getInstance(){
        return instance;
    }

}

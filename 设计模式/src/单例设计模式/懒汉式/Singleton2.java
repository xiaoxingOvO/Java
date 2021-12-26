package 单例设计模式.懒汉式;

/**
 * 静态内部类实现
 *
 * @author xiaoxing
 * @create 2021-12-17 15:41
 */
public class Singleton2 {

    private Singleton2(){};

    private static class Inner{
        private static Singleton2 Instance = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return Inner.Instance;
    }
}

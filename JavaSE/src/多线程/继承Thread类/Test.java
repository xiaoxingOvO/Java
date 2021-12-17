package 多线程.继承Thread类;

/**
 * @author xiaoxing
 * @create 2021-12-17 12:38
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

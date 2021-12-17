package 多线程.继承Thread类;

/**
 * 多线成的创建：继承于Thread类
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类的run()方法-->将此线程执行的操作声明在run()中
 * 3. 创建Thread类的子类的对象
 * 4. 通过此对象调用start()：作用：①启用当前线程  ②调用当前线程的run()
 * @author xiaoxing
 * @create 2021-12-17 12:37
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("This is run()");
    }
}

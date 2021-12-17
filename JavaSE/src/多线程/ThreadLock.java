package 多线程;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的方式三：Lock锁
 */
public class ThreadLock {
    public static void main(String[] args) {
        Window5 t = new Window5();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        //设置线程名
        t1.setName("窗口1");
        t2.setName("窗口2");

        //开始
        t1.start();
        t2.start();
    }
}

class Window5 implements Runnable {

    int ticket = 100;

    //1.实例化ReentrantLock
    private final ReentrantLock lock = new ReentrantLock();

    public void run() {

        while (true) {
            try {
                //2.调用锁定方法lock()
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                //调用解锁方法：unclock()
                lock.unlock();
            }
        }
    }
}

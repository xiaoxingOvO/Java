package 多线程;

/**
 * 方式二：实现Runnable接口
 * 例子：创建3个窗口卖票，总票数为100
 * 存在线程的安全问题：出现重票,错票
 * 原因：当某个线程操作ticket时，尚未完成操作，其他线程参与进来，也操作ticket
 * 解决：同步机制（同步代码块，同步方法，Lock锁）
 * 使用同步方法解决实现Runnable接口的线程安全问题
 */

public class ThreadExer3 {
    public static void main(String[] args) {

        Window3 window = new Window3();

        Thread window1 = new Thread(window);
        Thread window2 = new Thread(window);
        Thread window3 = new Thread(window);

        window1.start();
        window2.start();
        window3.start();

    }
}

class Window3 implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private synchronized void show() {//有同步监视器，同步监视器是this
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket--;
        }
    }
}

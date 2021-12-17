package 多线程;

/**
 * 方式一：继承于Thread类
 * 例子：创建3个窗口卖票，总票数为100
 * 存在线程的安全问题：三个窗口都卖了票号为100的票。出现重票
 * 解决：同步机制（同步代码块，同步方法，Lock锁）
 * 使用同步方法解决继承Thread类的线程安全问题
 */
public class ThreadExer4 {
    public static void main(String[] args) {

        Window4 window1 = new Window4();
        Window4 window2 = new Window4();
        Window4 window3 = new Window4();

        window1.setName("窗口一");
        window2.setName("窗口二");
        window3.setName("窗口三");

        window1.start();
        window2.start();
        window3.start();

    }
}

class Window4 extends Thread {

    private static int ticket = 100;//设置成静态才能共用

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private static synchronized void show() {//设置成静态之后，同步监视器变成了Window4.class
        //private synchronized void show()，同步监视器是this,对象有3个所有有问题
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket--;
        }
    }
}

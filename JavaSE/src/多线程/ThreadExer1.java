package 多线程;

/**
 * 方式一：继承于Thread类
 * 例子：创建3个窗口卖票，总票数为100
 * 存在线程的安全问题：三个窗口都卖了票号为100的票。出现重票
 * 解决：同步机制（同步代码块，同步方法，Lock锁）
 * 使用同步代码块解决继承Thread类的线程安全问题
 */
public class ThreadExer1 {
    public static void main(String[] args) {

        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();

        window1.setName("窗口一");
        window2.setName("窗口二");
        window3.setName("窗口三");

        window1.start();
        window2.start();
        window3.start();

    }
}

class Window extends Thread {

    private static int ticket = 100;//设置成静态才能共用

    @Override
    public void run() {
        while (true) {
            synchronized (Window.class) {//这里不能用this,this代表了3个对象
                if (ticket > 0) {
                    System.out.println(getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

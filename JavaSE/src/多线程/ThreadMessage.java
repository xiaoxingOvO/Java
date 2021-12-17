package 多线程;

/**
 * 线程通信的例子：使用两个线程交替打印1-100
 */
public class ThreadMessage {
    public static void main(String[] args) {
        Number number = new Number();

        Thread t1 = new Thread();
        Thread t2 = new Thread();
    }
}

class Number implements Runnable {

    private int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {

                notify();//唤醒调用wait()的线程

                if (number <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        wait();//使得调用wait()的线程进入阻塞状态,释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    break;
                }
            }
        }
    }
}
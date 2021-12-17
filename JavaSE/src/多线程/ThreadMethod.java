package 多线程;

/**
 * 练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数。
 * Thread中常用的方法：
 * 1. start():启动当前线程，调用当前线程的run()。
 * 2. run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中。
 * 3. currentThread():静态方法，返回执行当前代码的线程。
 * 4. getName():获取当前线程的名字。
 * 5. setName():设置当前线程的名字。
 * 6. yield():释放当前cpu的执行权。
 * 7. join():在线程a中调用线程b的join(),此时线程a就进入阻塞状态，直到线程b完全执行完以后，线程a才结束阻塞状态。
 * 8. stop():已过时。当执行此方法时，强制结束当前线程。
 * 9. sleep(long millitime):让当前线程“睡眠”指定的millitime毫秒。在指定的millitime毫秒时间内，当前线程是阻塞状态。
 * 10. isAlive():判断当前线程是否存活。
 */
public class ThreadMethod {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        //设置优先级
        myThread1.setPriority(10);
        myThread2.setPriority(1);

        //查看线程优先级
        System.out.println(myThread1.getPriority());
        System.out.println(myThread2.getPriority());


        myThread1.start();
        myThread2.start();

        // //只用一次，选择匿名的方式
        // new Thread(){
        //     @Override
        //     public void run() {
        //         for (int i = 0;i <= 100;i++){
        //             if(i % 2 == 0){
        //                 System.out.println(Thread.currentThread().getName()+"——————"+"i = " + i);
        //             }
        //         }
        //     }
        // }.start();
        //
        // new Thread(){
        //     @Override
        //     public void run() {
        //         for (int i = 0;i <= 100;i++){
        //             if(i % 2 != 0){
        //                 System.out.println(Thread.currentThread().getName()+"——————"+"i = " + i);
        //             }
        //         }
        //     }
        // }.start();

    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "——————" + "i = " + i);
            }
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + "——————" + "i = " + i);
            }
        }
    }
}
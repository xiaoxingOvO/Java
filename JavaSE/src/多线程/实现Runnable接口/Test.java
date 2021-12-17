package 多线程.实现Runnable接口;

/**
 * @author xiaoxing
 * @create 2021-12-17 12:43
 */
public class Test {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);

        t1.start();
        t2.start();
    }
}

package 多线程.实现Callable接口;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author xiaoxing
 * @create 2021-12-17 12:50
 */
public class Test {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        FutureTask f1 = new FutureTask(myThread);

        new Thread(f1).start();

        try {

            Object sum = f1.get();
            System.out.println("sum = " + sum);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

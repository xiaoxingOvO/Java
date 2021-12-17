package 多线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单个线程的线程池(newSingleThreadExecutor)
 * @author xiaoxing
 * @create 2021-12-17 13:49
 */
public class MyThread3 {
    public static void main(String[] args) {
        // 单一线程池,永远会维护存在一条线程
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++) {
            final int j = i;
            singleThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + ":" + j);
                }
            });
        }

        singleThreadPool.shutdown();

    }
}

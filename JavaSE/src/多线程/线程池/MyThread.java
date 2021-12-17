package 多线程.线程池;

import java.util.concurrent.*;

/**
 * 创建线程的方式四：使用线程池
 * JDK内置线程池有4种:
 *      1.固定线程数的线程池(newFixedThreadPool)
 *      2.缓存的线程池(newCachedThreadPool)
 *      3.单个线程的线程池(newSingleThreadExecutor)
 *      4.固定个数的线程池(newScheduledThreadPool)
 *           相比于第一个固定个数的线程池强大在:①可以执行延时任务，②也可以执行带有返回值的任务
 * @author xiaoxing
 * @create 2021-12-17 13:16
 */
public class MyThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool( 5);


        // for (int i = 0; i < 5; i++) {
        //
        //     fixedThreadPool.execute(new Runnable() {
        //         @Override
        //         public void run() {
        //             System.out.println(Thread.currentThread().getName());
        //         }
        //     });
        // }

        //可以有返回值
        for (int i = 0; i < 5; i++) {
            Future future = fixedThreadPool.submit(new Callable() {
                @Override
                public Object call() throws Exception {
                    System.out.println(Thread.currentThread().getName());
                    return 1;
                }
            });
            Object o = future.get();
            System.out.println(o);
        }

        fixedThreadPool.shutdown();
    }

}

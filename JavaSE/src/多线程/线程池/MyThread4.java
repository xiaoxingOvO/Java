package 多线程.线程池;

import java.util.concurrent.*;

/**
 * @author xiaoxing
 * @create 2021-12-17 13:54
 */
public class MyThread4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        第四种线程池:固定个数的线程池，相比于第一个固定个数的线程池 强大在 ①可以执行延时任务，②也可以执行有返回值的任务。
        scheduledThreadPool.submit(); 执行带有返回值的任务
        scheduledThreadPool.schedule() 用来执行延时任务.
        固定个数的线程池，可以执行延时任务，也可以执行带有返回值的任务。
         */
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

        FutureTask<String> ft = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("hello");
                return Thread.currentThread().getName();
            }
        });

        scheduledThreadPool.submit(ft);

        // 通过FutureTask对象获得返回值.
        String result = ft.get();
        System.out.println("result : " + result);

        // 执行延时任务
        scheduledThreadPool.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " : bobm!");
            }
        }, 3L, TimeUnit.SECONDS);

    }
}

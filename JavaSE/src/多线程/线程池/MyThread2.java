package 多线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 缓存的线程池(newCachedThreadPool)
 *  1.这是一个可以无限扩大的线程池;
 *  2.适合处理执行时间比较小的任务;
 *  3.线程空闲时间超过60s就会被杀死，所以长时间处于空闲状态的时候，这种线程池几乎不占用资源;
 *  4.阻塞队列没有存储空间，只要请求到来，就必须找到一条空闲线程去处理这个请求，找不到则在线程池新开辟一条线程。
 *      如果主线程提交任务的速度远远大于CachedThreadPool的处理速度，则CachedThreadPool会不断地创建新线程来执行任务，
 *      这样有可能会导致系统耗尽CPU和内存资源，所以在使用该线程池是，一定要注意控制并发的任务数，
 *      否则创建大量的线程可能导致严重的性能问题。
 * @author xiaoxing
 * @create 2021-12-17 13:43
 */
public class MyThread2 {
    public static void main(String[] args) {
        // 缓存线程池，无上限
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        cachedThreadPool.shutdown();
    }

}

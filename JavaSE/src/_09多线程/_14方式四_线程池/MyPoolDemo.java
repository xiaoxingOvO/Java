package _09多线程._14方式四_线程池;

import java.util.concurrent.*;

/**
 * @author xiaoxing
 * @create 2022-04-24 20:40
 */
public class MyPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        //设置线程池的属性
        // System.out.println(service.getClass());
        // service1.setCorePoolSize(15);
        // service1.setKeepAliveTime();

        //执行指定的线程的操作,需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new MyRunnable());//适合适用于Runnable

        Future submit = service.submit(new MyCallable());//适合使用于Callable
        Object o = submit.get();
        System.out.println(o);

        //3.关闭连接池
        service.shutdown();
    }
}

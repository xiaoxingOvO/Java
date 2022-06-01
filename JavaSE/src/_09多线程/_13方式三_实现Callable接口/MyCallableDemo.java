package _09多线程._13方式三_实现Callable接口;

import _09多线程._05方式二_实现Runnable接口.MyRunnable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author xiaoxing
 * @create 2022-04-24 20:36
 */
public class MyCallableDemo {
    public static void main(String[] args) {
        //创建Callable接口实现类的对象
        MyCallable  myCallable= new MyCallable();
        //将此Callable接口实现类的对象作为传递到FutureTask构造器中，创建FutureTask的对象
        FutureTask futureTask = new FutureTask(myCallable);
        //将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
        new Thread(futureTask).start();

        try {
            //获取Callable中call方法的返回值
            //get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值。
            Object sum = futureTask.get();
            System.out.println("总和为：" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

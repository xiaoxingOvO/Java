package 多线程.实现Callable接口;

import java.util.concurrent.Callable;

/**
 * 创建线程的方式三：实现Callable接口
 * 1.创建一个实现Callable的实现类
 * 2.实现call方法，将此线程需要执行的操作声明在call()中
 * 3.创建Callable接口实现类的对象
 * 4.将此Callable接口实现类的对象作为参数传递到FutureTask构造器中，创建FutureTask的对象
 * 5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
 * 6.获取Callable中call方法的返回值（不需要返回值就不要这一步）
 *    get()返回值即为FutureTask构造器参数Callable实现类重写的call()
 * @author xiaoxing
 * @create 2021-12-17 12:46
 */
public class MyThread implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("This is call()");
        int sum = 0;
        for (int i = 0;i<5;i++){
            sum = sum + i;
        }
        return sum;
    }
}

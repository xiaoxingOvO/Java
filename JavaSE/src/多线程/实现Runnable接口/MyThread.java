package 多线程.实现Runnable接口;

/**
 * 创建线程的方式二：实现Runnable接口
 *  1. 创建一个实现了Runnable接口的类
 *  2. 实现类去实现Runnable中的抽象方法：run()
 *  3. 创建实现类的对象
 *  4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 *  5. 通过Thread类的对象调用start()
 * @author xiaoxing
 * @create 2021-12-17 12:41
 */
public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("This is run()");
    }
}

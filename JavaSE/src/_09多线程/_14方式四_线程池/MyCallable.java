package _09多线程._14方式四_线程池;

import java.util.concurrent.Callable;

/**
 * @author xiaoxing
 * @create 2022-04-24 20:33
 */
public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

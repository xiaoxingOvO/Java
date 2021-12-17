package Java8新特性.java;

import org.junit.Test;

import java.util.Comparator;

/**
 * Lambda表达式的举例
 * @author xiaoxing
 * @create 2021-11-19 11:15
 */
public class LambdaTest {

    @Test
    public void test(){
        Runnable r = new Runnable(){

            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }

        };
        r.run();

        System.out.println("--------------------------------------");
        Runnable r1 = () -> System.out.println("我爱北京故宫");
        r1.run();
    }


    @Test
    public void test1() {

        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        int compare1 = comparator.compare(12,21);
        System.out.println(compare1);

        System.out.println("------------------------------------");

        //Lambda表达式
        Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1,02);
        int compare2 = com2.compare(32, 21);
        System.out.println(compare2);

        System.out.println("------------------------------------");

        //方法引用
        Comparator<Integer> com3 = Integer :: compare;
        int compare3 = com2.compare(32, 21);
        System.out.println(compare3);
    }

}

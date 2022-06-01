package _03集合._04泛型;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author xiaoxing
 * @create 2022-04-26 18:02
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {

        //不加泛型，默认是Object类型，可以存储任意类型的数据
        ArrayList arrayList = new ArrayList();
        arrayList.add("张三");
        arrayList.add(1);
        arrayList.add(new dog("小狗",22));
        arrayList.add(new cat("小猫",12));

        System.out.println(arrayList);
    }
}

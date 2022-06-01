package _05集合.myList._02ListInterator.test;

import java.util.ArrayList;
import java.util.List;

/*
    并发修改异常
    出现的原因
        迭代器遍历的过程中，通过集合对象修改了集合中的元素，造成了迭代器获取元素中判断预期修改值和实际
        修改值不一致，则会出现：ConcurrentModificationException
    解决的方案
        用for循环遍历，然后用集合对象做对应的操作即可
        或者可以用ListInterator（列表迭代器）

    需求：
        我有一个集合：List<String> list = new ArrayList<String>();
        里面有三个元素：list.add("hello");list.add("world");list.add("java");
        遍历集合，得到每一个元素，看有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现

    ConcurrentModificationException:当不允许这样的修改时，可以通过检测到对象的并发修改的方法来抛出此异常
 */
public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //遍历集合，得到每一个元素，看有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String s = it.next();
//            if(s.equals("world")) {
//                list.add("javaee");
//            }
//        }

        for(int i=0; i<list.size(); i++) {
            String s = list.get(i);
            if(s.equals("world")) {
                list.add("javaee");
            }
        }

        //输出集合对象
        System.out.println(list);
    }
}

package 反射;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author xiaoxing
 * @create 2021-11-17 10:45
 */
public class ReflectionTest {


    //反射之前，对于person类的操作
    @Test
    public void test(){

        //1.创建Person类的对象
        Person p1 = new Person("Tom",12);

        //2.通过对象，调用属性和方法
        p1.age = 10;
        System.out.println(p1.toString());

        p1.show();

        //在Person类的外部，不可以通过Person的对象调用其私有的结构
        //比如：私有的name属性，showNatiion()方法以及私有的构造器

    }

    @Test
    public void test1() throws Exception {

        Class c = Person.class;
        //1.通过反射，创建Person类的对象
        Constructor cons = c.getConstructor(String.class, int.class);
        Object obj = cons.newInstance("Tom", 12);
        Person p = (Person) obj;
        System.out.println(p.toString());

        //通过反射，调用对象指定的属性、方法
        //调用属性
        Field age = c.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p.toString());

        //调用方法
        Method show = c.getDeclaredMethod("show");
        show.invoke(p);

        System.out.println("---------------------------------");
        //通过反射，可以调用Person类的私有结构。
        //调用私有构造器
        Constructor cons1 = c.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 = (Person) cons1.newInstance("Jerry");
        System.out.println(p1);

        //调用私有属性
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"Mary");
        System.out.println(p1);

        //调用私有方法
        Method showNation = c.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation = (String) showNation.invoke(p1, "中国");//相当于String nation = p1.showNation("中国");
        System.out.println(nation);


        //总结：通过直接new的方式或反射的方式都可以调用公共的结构，开发中到底用哪个？
        //建议：直接new的方式
        //什么时候会使用反射的方式。反射的特征：动态性（一开始写的时候不知道要new谁）

        //总结：反射机制与封装性是不是相互矛盾了？
        //不矛盾，封装性是建议你调哪些，而反射解决的是能不能调。


    }


    /*
   关于java.lang.Class类的理解
   1.类的加载过程：
   程序经过javac.exe命令以后，会生成一个或多个字节码文件(.class结尾)。
   接着我们使用java.exe命令对某个字节码文件进行解释运行。相当于将某个字节码文件
   加载到内存中。此过程就称为类的加载。加载到内存中的类，我们就称为运行时类，此
   运行时类，就作为Class的一个实例。

   2.换句话说，Class的实例就对应着一个运行时类。
   3.加载到内存中的运行时类，会缓存一定的时间。在此时间之内，我们可以通过不同的方式
   来获取此运行时类。
    */
    //获取Class的实例的方式（前三种方式需要掌握）
    @Test
    public void test3() throws ClassNotFoundException {
        //方式一：调用运行时类的属性：.class
        Class<Person> c1 = Person.class;
        System.out.println(c1);
        //方式二：通过运行时类的对象，调用getClass()
        Person p1 = new Person();
        Class<? extends Person> c2 = p1.getClass();
        System.out.println(c2);

        //方式三：调用Class的静态方法：forName(String classPath)
        Class c3 = Class.forName("反射.Person");
        System.out.println(c3);

        //方式四：使用类的加载器：ClassLoader  (了解)
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class c4 = classLoader.loadClass("com.atguigu.java.Person");
        System.out.println(c4);

        System.out.println(c1 == c4);
    }

    //Class实例可以是哪些结构的说明：
    @Test
    public void test4(){
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
        // 只要数组的元素类型与维度一样，就是同一个Class
        System.out.println(c10 == c11);

    }
}

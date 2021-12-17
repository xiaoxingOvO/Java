package 反射.java1;

import org.junit.Test;
import 反射.java.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 调用运行时类中指定的结构：属性、方法、构造器
 * @author xiaoxing
 * @create 2021-11-18 15:50
 */
public class ReflectionTest {

    @Test
    public void testField() throws Exception {
        Class c = Person.class;

        //创建运行时类的对象
        Person p = (Person) c.newInstance();

        //获取指定的属性:要求属性为public
        //但通常属性设置为private，所有不常用
        Field id = c.getField("id");

        /*
        设置当前属性的值
        set(p,1001):参数1：设置哪个对象的属性，参数2：设置为多少

         */
        id.set(p,1001);

        /*
        获取当前属性的值
         */
        int pid = (int) id.get(p);
        System.out.println(pid);

    }

    /*
    如何操作运行时类中的指定的属性
     */
    @Test
    public void test1() throws Exception {
        Class c = Person.class;

        //1.创建运行时类的对象
        Person p = (Person) c.newInstance();

        Field name = c.getDeclaredField("name");

        //2.保证当前属性可访问，不设置就不能修改值
        name.setAccessible(true);

        //3.获取、设置指定对象的此属性值
        System.out.println(name.get(p));
        name.set(p,"Tom");
        System.out.println(name.get(p));

    }

    /*
    如何操作运行时类中的指定的方法 -- 需要掌握
     */
    @Test
    public void test2() throws Exception {
        Class c = Person.class;

        //创建运行时类的对象
        Person p = (Person) c.newInstance();

         /*
        1.获取指定的某个方法
        getDeclaredMethod():参数1 ：指明获取的方法的名称  参数2：指明获取的方法的形参列表
         */
        Method show = c.getDeclaredMethod("show",String.class);

        //2.保证当前方法是可访问的
        show.setAccessible(true);

        /*
        3. 调用方法的invoke():参数1：方法的调用者  参数2：给方法形参赋值的实参
        invoke()的返回值即为对应类中调用的方法的返回值。
         */
        Object retuneValue = show.invoke(p, "CHN");
        System.out.println("retuneValue = " + retuneValue);

        System.out.println("---------------调用静态方法---------------------");

        //如果调用的运行时类中的方法没有返回值，则此invoke()返回null
        Method showDesc = c.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        Object retuneValue1 = showDesc.invoke(p);
        System.out.println("retuneValue1 = " + retuneValue1);


    }

    /*
   如何调用运行时类中的指定的构造器
    */
    @Test
    public void testConstructor() throws Exception {
        Class clazz = Person.class;

        //private Person(String name)
        /*
        1.获取指定的构造器
        getDeclaredConstructor():参数：指明构造器的参数列表
         */

        Constructor constructor = clazz.getDeclaredConstructor(String.class);

        //2.保证此构造器是可访问的
        constructor.setAccessible(true);

        //3.调用此构造器创建运行时类的对象
        Person per = (Person) constructor.newInstance("Tom");
        System.out.println(per);

    }

}

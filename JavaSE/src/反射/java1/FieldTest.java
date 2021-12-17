package 反射.java1;

import org.junit.Test;
import 反射.java.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 测试获取运行时类(Person)的完整结构
 * @author xiaoxing
 * @create 2021-11-17 21:51
 */
public class FieldTest {

    @Test
    public void test(){

        Class<Person> c = Person.class;

        //获取属性结构
        //getFields()：获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = c.getFields();
        for(Field f : fields){
            System.out.println(f);
        }

        System.out.println("--------------------------------");

        //getDeclaredFields():获取当前运行时类中声明的所有属性 (不包含父类中声明的属性)
        Field[] declaredFields = c.getDeclaredFields();
        for(Field df : declaredFields){
            System.out.println(df);
        }

    }

    //取到属性后，还可以取到他们的权限修饰符、数据类型、变量名
    @Test
    public void test1(){

        Class c = Person.class;
        Field[] declaredFields = c.getDeclaredFields();

        int i = 1;
        for(Field f : declaredFields){

            //i = i++ +1;
            System.out.print("第"+ i++ +"个属性" + "\t");
            //1.获取权限修饰符
            int modifiers = f.getModifiers();
            System.out.print(Modifier.toString(modifiers) + "\t");

            //2.获取数据类型
            Class type = f.getType();
            System.out.print(type.getName()+ "\t");

            //3.获取变量名
            String fname = f.getName();
            System.out.println(fname);


        }





    }
}

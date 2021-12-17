package 反射.java1;

import org.junit.Test;
import 反射.java.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author xiaoxing
 * @create 2021-11-18 15:19
 */
public class OtherTest {

    /*
    获取构造器
     */
    @Test
    public void test(){

        Class c = Person.class;

        //getConstructors():获取当前运行时类中声明为public的构造器
        Constructor[] constructors = c.getConstructors();
        for(Constructor con : constructors){
            System.out.println(con);
        }

        System.out.println("------------------分隔符-----------------------");

        //getDeclaredConstructors():获取当前运行时类中所有的构造器
        Constructor[] declaredConstructors = c.getDeclaredConstructors();
        for(Constructor dcon : declaredConstructors){
            System.out.println(dcon);
        }

    }

    /*
    获取运行时的父类
     */
    @Test
    public void test1(){
        Class c = Person.class;

        Class superclass = c.getSuperclass();
        System.out.println(superclass);
    }

    /*
    获取运行时带泛型的父类
     */
    @Test
    public void test2(){
        Class c = Person.class;

        Type genericSuperclass = c.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    /*
    获取运行时带泛型的父类的泛型
     */
    @Test
    public void test3(){
        Class c = Person.class;

        Type genericSuperclass = c.getGenericSuperclass();
        ParameterizedType paramType = (ParameterizedType) genericSuperclass;
        //获取泛型类型
        Type[] actualTypeArguments = paramType.getActualTypeArguments();
//        System.out.println(actualTypeArguments[0].getTypeName());
        System.out.println(((Class)actualTypeArguments[0]).getName());
    }

    /*
    获取运行时类实现的接口
     */
    @Test
    public void test4(){
        Class c = Person.class;

        Class[] interfaces = c.getInterfaces();
        for(Class cl : interfaces){
            System.out.println(c);
        }

        System.out.println();
        //获取运行时类的父类实现的接口
        Class[] interfaces1 = c.getSuperclass().getInterfaces();
        for(Class cl : interfaces1){
            System.out.println(c);
        }

    }

    /*
        获取运行时类所在的包
     */
    @Test
    public void test5(){
        Class c = Person.class;

        Package pack = c.getPackage();
        System.out.println(pack);
    }

    /*
        获取运行时类声明的注解
     */
    @Test
    public void test6(){
        Class c = Person.class;

        Annotation[] annotations = c.getAnnotations();
        for(Annotation a : annotations){
            System.out.println(a);
        }
    }
    

}

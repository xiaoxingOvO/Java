package 反射.java1;

import org.junit.Test;
import 反射.java.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 获取运行时类的方法结构
 * @author xiaoxing
 * @create 2021-11-17 22:18
 */
public class MethodTest {

    @Test
    public void test(){

        Class c = Person.class;

        //getMethods():获取当前运行时类及其所有父类中声明为public权限的方法
        Method[] methods = c.getMethods();
        for(Method method : methods){
            System.out.println(method);
        }
        System.out.println("-------------------------分隔符--------------------------");

        //getDeclaredMethods():获取当前运行时类中声明的所有方法（不包含父类中声明的方法）
        Method[] declaredMethods = c.getDeclaredMethods();
        for(Method method : declaredMethods){
            System.out.println(method);
        }
    }

    /*
    @Xxxx
    权限修饰符  返回值类型  方法名(参数类型1 形参名1,...) throws XxxException{}
     */
    @Test
    public void test1(){
        Class c = Person.class;
        Method[] declaredMethods = c.getDeclaredMethods();
        for(Method m : declaredMethods){
            //1.获取方法声明的注解
            Annotation[] annotations = m.getAnnotations();
            for(Annotation annotation : annotations){
                System.out.println(annotation);
            }
            //2.获取权限修饰符
            System.out.print(Modifier.toString(m.getModifiers()) + "\t");

            //3.获取返回值类型
            System.out.print(m.getReturnType().getName() + "\t");

            //4.方法名
            System.out.print(m.getName());
            System.out.print("(");

            //5.形参列表
            Class<?>[] parameterTypes = m.getParameterTypes();
            if(!(parameterTypes == null && parameterTypes.length ==0)){
                for (int i = 0; i < parameterTypes.length; i++) {

                    if (i == parameterTypes.length-1){
                        System.out.print(parameterTypes[i].getName() + "args_" + i );
                        break;
                    }
                    System.out.print(parameterTypes[i].getName() + "args_" + i + ",");
                }
            }

            System.out.print(")");

            //6.抛出的异常
            Class[] exceptionTypes = m.getExceptionTypes();
            if (exceptionTypes.length > 0){
                System.out.print("throws ");

                for (int i = 0; i < exceptionTypes.length; i++){

                    if (i == exceptionTypes.length-1){
                        System.out.print(exceptionTypes[i].getName());
                        break;
                    }

                    System.out.print(exceptionTypes[i].getName() + ",");
                }
            }

            System.out.println();

        }
    }

}

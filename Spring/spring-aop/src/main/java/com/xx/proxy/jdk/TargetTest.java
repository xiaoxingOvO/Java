package com.xx.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiaoxing
 * @create 2022-05-01 17:04
 */
public class
TargetTest {

    public static void main(String[] args) {

        Target target = new Target();

        Advice advice = new Advice();

        TargetInterface proxy  = (TargetInterface) Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // 目标对象类加载器
                target.getClass().getInterfaces(), // 目标对象实现的接口
                new InvocationHandler(){
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 前置通知
                        advice.before();
                        //执行目标方法
                        method.invoke(target, args);
                        // 后置通知
                        advice.after();

                        return null;
                    }
                }
        );
        //调用代理对象的方法
        proxy.save();
    }
}

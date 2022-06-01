package _11Lambda和方法引用.myMethodReference._04引用对象实例方法;

public class PrintString {
    //把字符串参数变成大写的数据，然后在控制台输出
    public void printUpper(String s) {
        String result = s.toUpperCase();
        System.out.println(result);
    }
}

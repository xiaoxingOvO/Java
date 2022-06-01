package _11Lambda和方法引用.myInterface._01接口中默认方法;

public interface MyInterface {
    void show1();

    void show2();

//    void show3();

//    public default void show3() {
//        System.out.println("show3");
//    }

    default void show3() {
        System.out.println("show3");
    }
}

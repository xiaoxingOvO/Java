package 反射.java;

/**
 * @author xiaoxing
 * @create 2021-11-17 21:33
 */
@MyAnnotation(value = "hi")
public class Person extends Creature<String> implements Comparable<String>,MyInterface{

    private String name;
    int age;
    public int id;

    public Person(){}

    @MyAnnotation(value = "Per")
    private Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    //提供一些不同的方法，有返回值的，有参数的。
    @MyAnnotation()
    private String show(String nation){
        System.out.println("我的国籍是：" + nation);
        return nation;
    }

    public String display(String interests,int age) throws Exception{
        return interests;
    }


    @Override
    public int compareTo(String o) {
        return 0;
    }

    @MyAnnotation(value = "info")
    @Override
    public void info() {
        System.out.println("我是info方法");
    }

    private static void showDesc(){
        System.out.println("我是静态方法showDesc");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

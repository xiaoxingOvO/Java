package _03集合._04泛型;

/**
 * @author xiaoxing
 * @create 2022-04-26 18:07
 */
public class cat {
    private String name;
    private int age;

    public cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

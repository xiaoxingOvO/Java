package 反射.java;

import java.io.Serializable;

/**
 * @author xiaoxing
 * @create 2021-11-17 21:33
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }
}

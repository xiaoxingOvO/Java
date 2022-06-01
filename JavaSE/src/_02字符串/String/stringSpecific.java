package _02字符串.String;

import javax.lang.model.element.NestingKind;

/**
 * @author xiaoxing
 * @create 2022-04-26 15:46
 *
 * 字符串拼接方式
 * 1.+
 * 2.StringBuilder
 * 3.StringBuffer
 * 4.String的concat方法
 *
 */
public class stringSpecific {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";

        // +
        String s3 = s1 + s2;
        System.out.println(s3);

        //concat
        String s4 = s1.concat(s2);
        System.out.println(s4);

        //StringBuffer
        StringBuffer sb = new StringBuffer(s1);
        sb.append(s2);
        System.out.println(sb);

        //StringBuilder
        StringBuilder sb2 = new StringBuilder(s1);
        sb2.append(s2);
        System.out.println(sb2);

    }
}

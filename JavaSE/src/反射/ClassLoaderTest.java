package 反射;

import org.junit.Test;

import java.io.InputStream;
import java.util.Properties;

/**
 * 了解类的加载器
 * @author xiaoxing
 * @create 2021-11-17 17:25
 */
public class ClassLoaderTest {

    @Test
    public void test(){
        //对于自定义类，使用系统类加载器加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        //调用系统类加载器的getParent()：获取扩展类加载器
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);

        //调用扩展类加载器的getParent()：无法获取引导类加载器
        //引导类加载器主要负责加载java的核心类库，无法加载自定义类的。
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);
    }

    /*
    Properties:用来读取配置文件。
     */
    @Test
    public void test1() throws Exception {

        Properties properties = new Properties();
        //读取配置文件方式一：路径是在当前的model下
        // FileInputStream fis = new FileInputStream("src/反射/jdbc.properties");
        // properties.load(fis);

        //方式二：路径默认为当前model的src下
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("反射/jdbc.properties");
        properties.load(is);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println("user = " + user+",password = " + password);
    }
}

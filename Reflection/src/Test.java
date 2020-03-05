import charactor.Hero;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String Args[]) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        BufferedInputStream bis = new BufferedInputStream
                (new FileInputStream("src/hero.config.txt"));

        byte[] b = new byte[2048];
        bis.read(b);

        String className0 = new String(b);
        String className = className0.trim();
        System.out.println(className);
        Class pClass = Class.forName(className);
        Constructor c = pClass.getConstructor();

        Hero h = (Hero) c.newInstance();
        System.out.println(h);



        bis.close();
    }
}

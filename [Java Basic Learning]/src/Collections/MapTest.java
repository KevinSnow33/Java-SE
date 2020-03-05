package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        //    1.创建集合对象
        Map<Integer,Student> m1 = new HashMap<>();  //Map<Key,Value>
        //    2.创建元素对象
        Student s1 = new Student("乔峰",41);
        Student s2 = new Student("乔峰",41);  //Key不可以重复，value可以重复
        Student s3 = new Student("虚竹",38);
        Student s4 = new Student("段誉",26);
        //    3.将元素添加到集合中（.put（K,V））
        m1.put(1,s1);
        m1.put(2,s2);
        m1.put(3,s3);
        m1.put(4,s4);
        //直接打印集合
        System.out.println("直接打印结果为：");
        System.out.println(m1);

        //按Key取Value：（.get（Object Key））
        Object o1 = m1.get(1);
        System.out.println(o1);

        //获取Map集合中Key所构成的set集合：（.keySet（））
        
        Set set1 = m1.keySet();
        Iterator it = set1.iterator();
        System.out.println("通过普通迭代器打印结果为：");
        while (it.hasNext()){
            System.out.println(m1.get(it.next()));
        }

        System.out.println("通过增强for迭代器打印结果为：");
        for (Object o : set1) {
            System.out.println(m1.get(o));
        }
    }
}

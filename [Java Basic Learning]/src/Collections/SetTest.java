package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
    //    1.创建集合对象
        Set set1 = new HashSet();
    //    2.创建元素对象
        Student s1 = new Student("乔峰",41);
        Student s2 = new Student("乔峰",41);  //Set集合是唯一的，重复变量存入集合后会去重
        Student s3 = new Student("虚竹",38);
        Student s4 = new Student("段誉",26);
    //    3.将元素添加到集合中（.add（））
        set1.add(s1);
        set1.add(s2);
        set1.add(s3);
        set1.add(s4);
        //直接打印集合
        System.out.println("直接打印结果为：");
        System.out.println(set1);   //之所以还有两个乔峰是因为Student类里没有重写去重必要的equals和HashSet方法

        Iterator it = set1.iterator(); //多态使用Iterator迭代器接口
        System.out.println("通过普通迭代器打印结果为：");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("通过增强迭代器打印结果为：");
        for (Object o1 : set1) {
//            String ss = (String)o1;
            System.out.println(o1);  //直接打印对象，默认调用object.toString方法
        }



    }
}

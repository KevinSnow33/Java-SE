package Collections;
import java.util.List;
import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
//    1.创建集合对象
        List list = new ArrayList();
//    2.创建元素对象
        Student s1 = new Student("乔峰",41);
        Student s2 = new Student("乔峰",41);  //List集合具有可重复性，存的两个对象可以一样
        Student s3 = new Student("虚竹",38);
        Student s4 = new Student("段誉",26);
//    3.将元素添加到集合中（list.add（））
        list.add(s1);     //.add方法有boolean类型返回值，但实际没必要接收
        list.add(s2);
        list.add(s3);
        list.add(s4);
        //直接打印集合
        System.out.println(list);
        //用.get获取集合中索引为2的元素
        Object obj1 = list.get(2);     //返回值为泛型
        System.out.println(obj1);
        //用.size()获取集合中元素个数
        System.out.println("集合中元素个数为："+list.size());
//    4.遍历集合.
        for (int i = 0; i < list.size(); i++ ){
            Object obj2 = list.get(i);
            System.out.println("集合中第"+(i+1)+"个元素为"+list.get(i));
        }

//    5.增强for循环遍历(快捷键"iter+回车")
        for (Object o : list) {
            Student s = (Student)o;
            System.out.println(s);
        }
    }
}

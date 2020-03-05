package Collections;
import java.util.ArrayList;
import java.util.List;


public class Exercise {
    public static void main(String[] args){
        List l1 = new ArrayList();
        Student s1 = new Student("乔峰",41);
        Student s2 = new Student("乔峰",41);  //集合具有可重复性，存的两个对象可以一样
        Student s3 = new Student("虚竹",38);
        Student s4 = new Student("段誉",26);
        l1.add(s1);     //.add方法有boolean类型返回值，但实际没必要接收
        l1.add(s2);
        l1.add(s3);
        l1.add(s4);
        System.out.println(l1);
        Object obj1 = l1.get(3);
        System.out.println(obj1);
        System.out.println(l1.size());
        for (Object o : l1) {
            Student s = (Student)o;
            System.out.println(s);
        }



    }
}

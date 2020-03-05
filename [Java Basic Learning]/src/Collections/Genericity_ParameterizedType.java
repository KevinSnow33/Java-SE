package Collections;

import java.util.ArrayList;
import java.util.List;

public class Genericity_ParameterizedType {
    public static void main(String[] args) {
        /*不用泛型可能会有类型安全问题*/

//        List l1 = new ArrayList();
//        l1.add("a");
//        l1.add("b");
//        l1.add("c");
//        l1.add(100);  //非String类型
//        for (Object o1 : l1) {
//            String s = (String) o1;
//            System.out.println(s);    //会报错，因为有个元素是int类型
//        }

        /*泛型演示*/
        List<String> l2 = new ArrayList<>();
        l2.add("a");
        l2.add("b");
        l2.add("c");
//        l2.add(100);  //非泛型类型此处会报错
        for (String ss : l2) {
            System.out.println(ss);
        }
    }
}

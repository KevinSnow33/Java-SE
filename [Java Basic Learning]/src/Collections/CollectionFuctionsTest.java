package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionFuctionsTest {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add(3);
        l1.add(5);
        l1.add(2);
        l1.add(4);
        l1.add(1);
//        l1.add('a');
//        l1.add('b');
//        l1.add('c');

        System.out.println(Collections.max(l1));   //取最大值

        Collections.sort(l1);   //排序
        System.out.println(l1);

        Collections.reverse(l1); //换序
        System.out.println(l1);

        Collections.shuffle(l1);  //乱序
        System.out.println(l1);




    }
}

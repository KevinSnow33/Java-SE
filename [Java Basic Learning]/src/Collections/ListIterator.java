package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ListIterator {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("a");
        l1.add("b");
        l1.add("c");

        Iterator it = l1.iterator();   //多态使用Iterator迭代器接口
//        ListIterator lit = l1.listIterator();    //不知为何导包报错！！！
        while (it.hasNext()){               //.hasNext()判断迭代器是否有元素
            String s = (String)it.next();   //.Next()获取元素
            if("b".equals(s)){
//                l1.add("java");   //这样写会引发并发修改异常
            }
        }
    }
}

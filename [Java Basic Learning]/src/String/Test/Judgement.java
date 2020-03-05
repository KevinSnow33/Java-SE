package String.Test;

public class Judgement {
    public static void main(String[] args) {

        String s = new String("abc");  //可以在构造方法里直接写字符串
        System.out.println(s);

        byte[] by = {97, 98, 99};
        String s1 = new String(by);   //构造String对象，将指定字节数组转换为字符串(97,97,99对应abc)
        System.out.println(s1);

        char[] ch = {'a', 'b', 'c'};
        String s2 = new String(ch);
        System.out.println(s2);       //构造String对象，将指定字符数组转换为字符串

        /*一个字符串是一个对象(字符串常量)，构造时可以免new直接构造，如下：*/
        String s3 = "ABC";   //免new
        String s4 = new String("ABC");   //传统构造
        /*因为是对象，比较的是地址值，所以直接比较值为false*/
        System.out.println(s3 == s4);


        /*两字符串比较应该用  str1.equals(str2) 方法*/
        System.out.println(s3.equals(s4));

        /*忽略大小写的字符串比较方法为：str1.equalsIgnoreCase(str2)*/
        String s5 = "abc";
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));

        /*判断是否以给定字符串开头:str.startsWith("")*/
        System.out.println(s5.startsWith("ab"));
        System.out.println(s5.startsWith("b"));

        /*判断字符串是否为空：str.isEmpty()*/
        System.out.println(s5.isEmpty());

    }
}

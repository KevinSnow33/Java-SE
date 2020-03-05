package String.Test;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append("abc");  //调用完s1.append方法后得到字符串值自动返回s1对象自身
        System.out.println(s1);

        /*也可以直接在形参处赋值*/
        StringBuilder s2 = new StringBuilder("edf");
        System.out.println(s2);

        StringBuilder s3 = new StringBuilder();
        s3.append("第一段字符串");
        s3.append("第二段字符串");
        s3.append("第三段字符串");
        s3.append("拼在一起成为s3");
        System.out.println(s3);  //能输出结果，但s3是StringBuilder类，不是String类

        String s4 = s3.toString();  //用StringBuider类下的str.toString()方法转换成字符串
        System.out.println(s4);


    }
}

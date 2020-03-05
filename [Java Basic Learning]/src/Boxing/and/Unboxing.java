package Boxing.and;

public class Unboxing {
    public static void main(String[] args) {
        Integer i1 = new Integer(20);    //装箱
        int b1 = i1.intValue();   //拆箱

        //Autoboxing and unboxing
        Integer i2 = 30;   //自动装箱
        int b2 = i2;       //自动拆箱

        //static 基本类型.parseXxx();  将字符串转换为对应类型变量
        String i3 ="50";  //字符串
        int b3 = Integer.parseInt(i3);  //返回值用int型变量接受


    }
}

package Exception;

public class Throws_Test {
    public static void main(String[] args) {
        /*方式一：主函数也加throws Exception继续抛出异常给JVM，JVM报错程序停止运行*/
//        show();

        /*方式二：用try.catch.finally捕获处理*/
        try{
            show();
        }catch (Exception e){
            System.out.println("出错了！");
        }
        //不写finally也可以

    }

    public static void show ()throws Exception{    //在方法后面添加throws Exception抛出异常
        int i = 10/0;
        System.out.println("我成功执行了！");
    }
}

package Static;

public class Test {
    public static void main(String[] args) {
        Developer d1 = new Developer("小黑","敲代码");
        Developer d2 = new Developer("媛媛","鼓励师");
        d1.selfIntroduction();
        d1.selfIntroduction();
        Developer.DEPARTMENT = "销售部";   //当DEPARTMENT不加final修饰时
        d2.selfIntroduction();
        d2.selfIntroduction();
        System.out.println(d1 instanceof Developer );

        Developer.show(d1);
    }



}

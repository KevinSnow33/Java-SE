package Interface;

public class Test {
    public static void main(String[] args) {
        Smoking s1 = new Teacher();   //接口无法实例化，应该用多态做法
        s1.smoke();
    }
}

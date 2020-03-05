package Exception;

public class TCF_Test {
    public static void main(String[] args) {
        try{
            int i = 10/0;
            System.out.println("尝试执行的代码执行成功了！");
            return;
        }catch (Exception e){
            System.out.println("出错了！");
            return;
        }finally {
            System.out.println("虽然try和catch有return，但我finally也执行了！");
        }
    }
}

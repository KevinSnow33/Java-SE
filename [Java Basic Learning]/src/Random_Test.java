import java.util.Random;
public class Random_Test {
    public static void main(String[] args){
        Random r = new Random();

        int i = r.nextInt(10);
        System.out.println("i="+i);
    }
}
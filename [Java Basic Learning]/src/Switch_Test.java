import java.util.Scanner;
public class Switch_Test {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int date = sc.nextInt();

        switch(date){
            case 1:
                System.out.println("是1号");
                break;
            case 2:
            System.out.println("是2号");
            break;
            case 3:
            default:
            System.out.println("狗屁");
                break;
        }




    }
}

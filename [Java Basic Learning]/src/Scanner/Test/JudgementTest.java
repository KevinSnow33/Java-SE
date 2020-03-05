package Scanner.Test;

import java.util.Scanner;

public class JudgementTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入整数");
        if (sc.hasNextInt()){     //用hasNextXxx避免输入类型异常
            int i = sc.nextInt();
            System.out.println(i);
        }

        System.out.println("请输入字符串");
        Scanner str = new Scanner(System.in);
//        String s = str.nextLine();  //以换行符结束
        String s = str.next();  //以空白字符（空格，tab，换行符）结束

        System.out.println(s);



    }
}

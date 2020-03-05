import java.util.ArrayList;
import java.util.Random;

public class decoding {
    public static void main(String[] args) {
//       随机3位数字密码的建立（存入password）
        StringBuffer password = new StringBuffer();
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            int num = r.nextInt(10);
            password.append(num);
        }

//        System.out.println(password);

        ArrayList<StringBuffer> words = new ArrayList<>();

//      破解线程：穷举000-999并放入集合
        Thread decoding = new Thread(){

            public void run(){
                for(int i = 0; i < 10; i++){
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 10; k++) {
                            StringBuffer tryword = new StringBuffer();
                            tryword.append(i);
                            tryword.append(j);
                            tryword.append(k);

                            words.add(tryword);
                            System.out.println(tryword);
                        }
                    }
                }
            }
        };


//      日志线程
        Thread log = new Thread(() -> {
            while (true) {
                if (words.size() == 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    int last = words.size() - 1;
                    StringBuffer getword = words.get(last);
                    if ((getword.toString()).equals(password.toString())){
                        System.out.println("破解成功，密码为：" + words.get(last));
                        break;
                    }
                    words.remove(last);
                }
            }
        });

        decoding.start();
        log.start();





    }
}

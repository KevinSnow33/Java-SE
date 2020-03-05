public class a_du_gen {
    public static void main(String args[]){
        Thread adugen = new Thread(){
            public void run(){
                while(true){
                    int count = 1;
                    while(count < 4){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("波动拳第" + count++ + "发");
                    }
                    System.out.println("开始为时5s的充能");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        adugen.start();
    }
}

package IO;

import java.io.*;

public class InandOutputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream is = new FileInputStream("src/prs2.jpg");
        FileOutputStream os = new FileOutputStream("src/prsnew1.jpg");

        /*按单个字节读写*/
//        int byte1;
//        while ((byte1 = is.read()) != -1){
//            os.write(byte1);
//        }

        /*按字节数组读写*/
        int len;
        byte[] bytes = new byte[2048];
        while((len = is.read(bytes)) != -1){
            os.write(bytes);
        }

        is.close();
        os.close();
    }
}

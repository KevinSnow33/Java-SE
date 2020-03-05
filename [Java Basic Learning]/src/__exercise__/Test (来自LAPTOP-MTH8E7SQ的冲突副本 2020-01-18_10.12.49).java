package __exercise__;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args)throws Exception{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/PRS2.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/prs333.jpg"));

        byte[] buffer = new byte[2048];

        int len;

        while ((len = bis.read(buffer)) != -1){
            bos.write(buffer);
        }

        bis.close();
        bos.close();

    }
}

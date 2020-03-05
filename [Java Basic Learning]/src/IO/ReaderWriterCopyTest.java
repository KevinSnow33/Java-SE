package IO;

import java.io.*;

public class ReaderWriterCopyTest {
    public static void main(String[] args) throws IOException {
        /*把1.txt里内容复制到4.txt中*/

        Reader fr = new FileReader("src/1.txt");
        Writer fw = new FileWriter("src/4.txt"); //如果文件不存在将自动创建

//        /*单个字符复制*/
//        int ch;
//        while ((ch = fr.read()) != -1){
//            fw.write(ch);
//        }

        /*用字符数组复制*/
        char[] chs = new char[1024];   //定义字符数组，个数写1024的倍数
        int len;
        while ((len = fr.read(chs)) != -1){   //用if也行，因为是一次读完
            fw.write(chs, 0, len);
        }

        fr.close();
        fw.close();

    }
}

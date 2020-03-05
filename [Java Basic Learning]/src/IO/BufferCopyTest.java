package IO;

import java.io.*;

public class BufferCopyTest {
    public static void main(String[] args) throws IOException {
        /*创建字符缓冲输入流对象，关联数据源文件*/
        FileReader fr = new FileReader("src/1.txt");
        BufferedReader br = new BufferedReader(fr);
        /*创建字符缓冲输出流对象，关联目的地文件*/
        FileWriter fw = new FileWriter("src/4.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        char[] chs = new char[1024];
        int len;
        while((len = br.read(chs)) != -1){
            bw.write(chs, 0, len);
        }

        br.close();
        bw.close();
    }
}

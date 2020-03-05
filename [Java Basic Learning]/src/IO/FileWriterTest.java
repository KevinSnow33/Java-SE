package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("src/3.txt");

//        /*一个字符*/
//        writer.write('好');
        /*字符数组*/
        char[] chs = {'完','犊','子'};

        /*字符串*/
        writer.write("小鼠要乖乖地！！！");
//        writer.write("别忘了close文件");

        writer.close();
    }
}

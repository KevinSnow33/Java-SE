package IO;

import java.io.*;

public class Buffer_readLinenewLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/4.txt"));

        String s;
        while((s = br.readLine()) != null){
            bw.write(s);
            bw.newLine();  //换行方法，在不同系统下也能实现换行
        }

        br.close();
        bw.close();

    }
}

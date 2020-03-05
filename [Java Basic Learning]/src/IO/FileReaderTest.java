package IO;

import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
       /*创建字符输入流Reader对象*/
        Reader reader = new FileReader("src/1.txt");

        /*用.read()读取一个字符（返回值为int类型）*/
//        int ch1 = reader.read();   //以int类型读取一个字符
//        System.out.println(ch1);

//        int ch;
//        while ((ch = reader.read()) != -1){     //while遍历
//            System.out.println(ch);
//        }


        /*用.read(char[chs])读取一个字符数组（存于chs中）（返回值为int类型字符串长度）*/
        char[] chs = new char[3];  //字符数组初始化限定个数为3
        int length;

//        //字符数组可以通过数组名直接打印
//        length = reader.read(chs);
//        System.out.println(length);  //3
//        System.out.println(chs);     //Hey
//
//        length = reader.read(chs);
//        System.out.println(length);  //3
//        System.out.println(chs);     //,wh
//
//        length = reader.read(chs);
//        System.out.println(length);  //3
//        System.out.println(chs);     //at'
//
//        length = reader.read(chs);
//        System.out.println(length);  //3
//        System.out.println(chs);    //s u
//
//        length = reader.read(chs);
//        System.out.println(length);  //2
//        System.out.println(chs);     //p?u    第3个字符保留上次结果u

        int len;
        while ((len = reader.read(chs)) != -1){
            String s = new String(chs, 0, len); //每次循环将当次chs转换为字符串，用len限制不会多转换u
            System.out.println(s);
        }


        /*释放资源*/
        reader.close();
    }
}

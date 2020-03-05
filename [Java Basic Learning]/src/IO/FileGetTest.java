package IO;

import java.io.File;

public class FileGetTest {
    public static void main(String[] args) {

        File file1 = new File("src/1.txt");  //此处写相对路径，因此getpath返回值也是相对路径

        /*获取绝对路径赋给字符串*/
        String absolutePath = file1.getAbsolutePath();
        System.out.println(absolutePath);

        /*获取相对路径赋给字符串*/       //定义时写的是绝对结果就是绝对，
        String path = file1.getPath();  //写的是相对路径结果就是相对
        System.out.println(path);

        /*获取文件名*/
        String filename = file1.getName();
        System.out.println(filename);

        /*用 字符串数组 获取该路径下所有文件和文件夹名*/
        File file2 = new File("src");
        String[] s1 = file2.list();
        for (String s : s1) {
            System.out.println(s);
        }

        /*用 对象数组 获取该路径下所有文件和文件夹*/
        File[] files = file2.listFiles();
        for (File file : files) {
            System.out.println(file.getName());   //因为是对象，可以遍历调用方法
        }




    }
}

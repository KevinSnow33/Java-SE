package IO;

import java.io.File;

public class FileTest {
    public static void main(String[] args)throws Exception {
        /*创建File对象*/
        /*方式1：字符串路径*/
        File file1 = new File("D:\\Desktop\\同步\\Computer Science\\JAVA\\Workspaces\\[JAVA Workspaces]\\src/1.txt");
        /*方式2：字符串父目录和子目录*/
        File file2 = new File("D:\\Desktop\\同步\\Computer Science\\JAVA\\Workspaces","[JAVA Workspaces]\\src/1.txt");
        /*方式3：父目录对象和字符串子目录*/
        File file3 = new File("D:\\Desktop\\同步\\Computer Science\\JAVA\\Workspaces");
        File file4 = new File(file3,"[JAVA Workspaces]\\\\src/1.txt\"");


        /*File类下创建文件的方法：.createNewFile()*/
        File file5 = new File("D:\\Desktop\\同步\\Computer Science\\JAVA\\Workspaces\\[JAVA Workspaces]\\src/2.txt");
        file5.createNewFile();   //create时路径可能有问题，所以需要异常处理

        /*File类下创建（单级）文件夹的方法：.mkdir()*/
        File file6 = new File("D:\\Desktop\\同步\\Computer Science\\JAVA\\Workspaces\\[JAVA Workspaces]\\src/a");
        file6.mkdir();

        /*File类下创建（多级）文件夹的方法：.mkdirs()*/
        File file7 = new File("D:\\Desktop\\同步\\Computer Science\\JAVA\\Workspaces\\[JAVA Workspaces]\\src/b/c/d");
        file7.mkdirs();

        /*File类下判断方法：.isDirectory(),isFile(),exists()*/
        File file8 = new File("D:\\Desktop\\同步\\Computer Science\\JAVA\\Workspaces\\[JAVA Workspaces]\\src/b/c");
        System.out.println(file8.isDirectory());
        System.out.println(file8.isFile());
        System.out.println(file8.exists());




    }
}

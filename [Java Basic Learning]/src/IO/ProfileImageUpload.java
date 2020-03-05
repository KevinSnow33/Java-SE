package IO;

import java.io.*;
import java.util.Scanner;

public class ProfileImageUpload {
    public static void main(String args[]) throws IOException {
        /*getPath()方法上传文件并返回上传后的文件*/
        File file = getPath();
        System.out.println(file.getPath());  //获取相对路径
        /*isExist方法判断是否已经有重名文件*/
        if (isExist(file.getName()))   //只取文件名本身不带前缀路径，方便下面做比较
            System.out.println("文件已存在，上传失败");
        else
            System.out.println("即将上传");
        /*upLoad()方法将文件上传到目标路径lib下*/
        upLoad(file);
    }

    public static File getPath() {    //返回文件而非字符串是为了调用File.getName()方法取不带路径的文件名
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入要上传的文件路径：");
            String path = sc.next();
            if (!(path.endsWith(".jpg") || path.endsWith(".png") || path.endsWith(".bmp"))) {
                System.out.println("您输入的不是图片，请重新输入");
                continue;
            }

            File file = new File(path);
            if (file.exists() && file.isFile()) {
                return file;
            } else {
                System.out.println("您输入的路径不合法，请重新输入");
            }
        }
    }

    public static boolean isExist(String path){
        File file = new File("src");
        String[] names = file.list();
        for (String name : names) {
//            System.out.println(name);
            if (name.equals(path)){
                System.out.println("有重名文件！");
                return true;
            }
        }
        return false;
    }

    public static void upLoad(File file) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/"+ file.getName()));

        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }

        System.out.println("上传成功！");

        bis.close();
        bos.close();
    }
}

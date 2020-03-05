package JavaBean;

public class Student_Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("Liu Xiaofei");
        stu1.setAge(19);
        stu1.setSex("男");

        Student stu2 = new Student("Huang Qianxin", 19, "男");

        Student stu3 = new Student();
        stu3.setName("Liu Xiaofei");
        stu3.setAge(19);
        stu3.setSex("男");

//        System.out.println(stu1.getName());
//        System.out.println(stu1.getAge());
//        System.out.println(stu1.getSex());
//
//        System.out.println(stu2.getName());
//        System.out.println(stu2.getAge());
//        System.out.println(stu2.getSex());

        System.out.println(stu1.equals(stu3));
        System.out.println(stu1);
        System.out.println(stu3);

    }


}

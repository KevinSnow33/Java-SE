package Reflect;

public class Student {

    public String name;
    private int age;


    public Student() {
    }

    public Student(int age) {
        System.out.println("学生年龄为：" + age);
    }

    private  Student(String name){
        System.out.println("学生姓名为：" + name);
    }

    public void method1(){
        System.out.println("我是public成员函数");
    }

    private void method2(){
        System.out.println("我是private成员函数");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

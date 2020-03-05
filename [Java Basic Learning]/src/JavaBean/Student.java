package JavaBean;

public class Student {

    //无参构造方法
    public Student(){}
    //全参构造方法
    public Student(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;

    }


    private String name;
    private int age;
    private String sex;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getSex(){
        return this.sex;
    }

}

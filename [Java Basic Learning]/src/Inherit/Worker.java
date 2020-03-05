package Inherit;

public class Worker extends Person {
    String skin;

    public Worker() {
        super("黑哥");
        System.out.println("是小黑");
    }

    public Worker(String name, int age, String skin){
//        super.name = name;
//        super.age = age;
        super(name, age);
        this.skin = skin;
    }

//    public Worker(String name, int age) {
//        super(name, age);
//    }
}

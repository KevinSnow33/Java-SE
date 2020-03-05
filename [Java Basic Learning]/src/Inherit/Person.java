package Inherit;

public class Person {
    String name;
    int age;


    public Person(String name) {
        System.out.println("是人");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

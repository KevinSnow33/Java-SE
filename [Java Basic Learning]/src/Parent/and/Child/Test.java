package Parent.and.Child;

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.setName("Tom");
        c.setAge(13);

//        Child c0 = new Child("Jerry",14);

        System.out.println(c.getName());
        System.out.println(c.getAge());
        c.childPrint();
    }
}

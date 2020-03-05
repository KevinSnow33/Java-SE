package Inherit;

public class animals_test {
    public static void main(String[] args){
        Animals d = new dog();
        d.setName("Doggy");
        d.setAge(85);
        d.setSex("male");

//        Animals p = new pig("Piggy",3,"female");
        Animals p = new pig();
        p.setName("Piggy");
        p.setAge(3);
        p.setSex("female");

        System.out.println(d.getName());
        System.out.println(d.getSex());
        System.out.println(d.getAge());
        System.out.println(p.getName());
        System.out.println(p.getSex());
        System.out.println(p.getAge());

//        d.eat();
//        d.watch();
//        p.eat();
//        p.sleep();

    }
}

public class ____Exercise_Class____ {

    String name;
    int age ;

    public ____Exercise_Class____() {
        System.out.println("无参构造");
    }

    public ____Exercise_Class____(String name, int age) {
        System.out.println("带参构造");
        this.name = name;
        this.age = age;
    }

    public void show()
    {

        int age = 10;
        System.out.println("局部" + age);
        System.out.println(this.age);
        System.out.println(name);
    }


}





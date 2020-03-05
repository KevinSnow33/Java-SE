package Polymorphism;

public class Test {
    public static void main(String[] args) {
         Animal an = new Dog();

//        an.eat();
//        Dog d = (Dog)an;  //
//        d.watch();  //才能用Dog类下特有方法watch


        Animal an0 = new Pig();
        showAnimal(an);
        showAnimal(an0);




    }

    public static void showAnimal(Animal an){
        an.eat();   //子父类方法重名时：编译看左（检查左边类型有没有这个成员），运行看右（即运行子类方法,即实现多态）
        System.out.println(an.name);    //子父类变量重名时：编译看左，运行看左（即调用父类变量）
    }

}

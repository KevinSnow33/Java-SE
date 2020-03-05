package Inherit;

public class dog extends Animals {

    public dog(String name, int age, String sex) {
        super(name, age, sex);
    }

    public dog() {
    }

    public void watch(){
        System.out.println("能看家");
    }
}

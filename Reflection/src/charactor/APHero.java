package charactor;

public class APHero extends Hero {

    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public String toString() {
        return "APHero{" +
                "name='" + name + '\'' +
                '}';
    }
}
package Abstract;

public class Manager extends Employee{
    public Manager() {
    }

    public Manager(String name, double salary, String id, double bonus) {
        super(name, salary, id);
        this.bonus = bonus;    //manager类下独有变量
    }

    private double bonus;

    @Override
    public void work(){
        System.out.println("看着程序员敲代码");
    }
}

package Abstract;

public abstract class Employee {
    private String name;
    private double salary;
    private String id;

    public Employee() {       //空参构造
    }

    public Employee(String name, double salary, String id) {    //全参构造
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public abstract void work();  //抽象方法不写函数体{}，直接在形参（）后加;
}

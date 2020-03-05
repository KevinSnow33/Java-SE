package Static;

public class Developer {
    private String name;
    private String work;
    static  String DEPARTMENT = "研发部";

    public Developer(){}

    public Developer(String name, String work) {
        this.name = name;
        this.work = work;
    }

    public static void show(Developer d) {
        System.out.println(d.name + d.work);
    }

    public void selfIntroduction(){
        System.out.println(DEPARTMENT+"的"+this.name+"工作内容为："+this.work);
    }
}

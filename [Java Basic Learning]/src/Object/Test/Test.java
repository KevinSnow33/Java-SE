package Object.Test;

public class Test {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        int hash1 = obj1.hashCode();
        int hash2 = obj2.hashCode();
        System.out.println(hash1);
        System.out.println(hash2);
        System.out.println("--------------");

        Class c1 = obj1.getClass();
        Class c2 = obj2.getClass();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("--------------");

        String s1 = obj1.toString();
        String s2 = obj2.toString();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("--------------");

        boolean b = obj1.equals(obj2);
        System.out.println(b);

    }
}

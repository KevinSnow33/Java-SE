package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Constructor_Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        /*获取Student类字节码文件对象*/
        Class aClass = Class.forName("Reflect.Student");

        /*反射：用构造器获取构造方法并创建对象(返回所创建的对象)*/
        Student stu = constructorMethodTest(aClass);

        /*反射：获取成员方法并用具体对象调用方法*/
        methodTest(aClass, stu);

        /*反射：获取成员变量*/
        Student stu2 = (Student) aClass.getConstructor().newInstance(); //链式编程，一个方法返回值是对象时可以连续写
        variableTest(aClass, stu2);


    }

    static Student constructorMethodTest(Class clazz) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        //        /*获取Student类中公共无参构造函数*/
//        Constructor con1 = aClass.getConstructor();
//        System.out.println(con1);
//        /*获取Student类中公共有参构造*/
//        Constructor con2 = aClass.getConstructor(int.class);
//        System.out.println(con2);
//        /*获取Student类中私有有参构造*/
//        Constructor con3 = aClass.getDeclaredConstructor(String.class);
//        System.out.println(con3);
//
//        /*获取Student类中所有！公共！构造函数*/
//        Constructor[] cons = aClass.getConstructors();
//        for (Constructor con : cons) {
//            System.out.println(con);
//        }
//

        /*获取Student类中公共无参构造函数*/
        Constructor con1 = clazz.getConstructor();
        System.out.println(con1);

        /*获取.getName()构造函数名*/
        String name = con1.getName();
        System.out.println(name);

        /*使用构造函数(带参数)创建对象（.newInstance()返回值默认为Object类型）*/
        Student stu = (Student) con1.newInstance();
        System.out.println(stu);

        return stu;
    }

    static void methodTest(Class clazz, Student stu) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        /*获取Student类中公共成员方法*/
        Method method1 = clazz.getMethod("method1");

        /*获取Student类中私有成员方法*/
        Method method2 = clazz.getDeclaredMethod("method2");

        /*打印方法对象*/
        System.out.println(method1);
        System.out.println(method2);
        /*打印方法名*/
        System.out.println(method1.getName());
        System.out.println(method2.getName());


        /*（用具体对象）调用该方法*/
        method1.invoke(stu);
    }

    static void variableTest(Class clazz, Student stu) throws NoSuchFieldException, IllegalAccessException {
        /*用域对象通过字节码对象获取类的公共成员变量*/
        Field field1 = clazz.getField("name");
        field1.set(stu, "张无忌");
        /*用域对象通过字节码对象获取类的私有成员变量*/
        Field field2 = clazz.getDeclaredField("age");
        //开启暴力反射
        field2.setAccessible(true);
        field2.set(stu, 50);

        /*打印stu对象（已重写toString方法）*/
        System.out.println(stu);
    }

}
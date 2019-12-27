package com.it.zyz.oop;

/**
 * @author ljh
 * @create 2019-12-27 14:01
 */
public class OOPTest {
    public static void main(String[] args) {
        //创建Person类的对象
        Person person=new Person();
        //调用对象功能
        //调用属性："对象.属性"
        person.name="孙悟空";
        person.isMale=true;
        System.out.println(person.name);
        //调用方法：“对象.方法”
        person.eat();
        person.sleep();
        person.talk("Chinese");
    }
}
class Person{
    //属性()
    String name;
    int age;
    boolean isMale;
    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话，使用的是："+language);
    }
}
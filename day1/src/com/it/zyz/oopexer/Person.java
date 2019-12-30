package com.it.zyz.oopexer;

/**
 * @author ljh
 * @create 2019-12-30 10:18
 */
public class Person {
    String name;
    int age;
    int sex;

    public void study(){
        System.out.println("studying");
    }
    public void showAge()
    {
        System.out.println("age:"+age);
    }
    public int addAge(int i){
        age+=i;
        return age;
    }
}

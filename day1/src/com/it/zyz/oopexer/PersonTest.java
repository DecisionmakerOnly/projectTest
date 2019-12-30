package com.it.zyz.oopexer;

/**
 * @author ljh
 * @create 2019-12-30 10:19
 */
public class PersonTest {
    public static void main(String[] args) {
        /**
         * 要求:
         * (1)创建Person类的对象,设置该对象的name, age和sex属性,调用study方法,
         *  输出字符串"studying",调用showAge ()方法显示age值,
         *  调用addAge()方法给对象的age属性值增加2岁
         * (2)创建第二个对象,执行上述操作,体会同一个类的不同对象之间的关系。
         */
        Person person =new Person();
        person.name="Tom";
        person.age=18;
        person.sex=1;

        person.study();
        person.showAge();
        person.addAge(2);
        System.out.println(person.name+"新年龄："+person.age);
        System.out.println("============================");
        Person person2 =new Person();
        person2.showAge();//0
    }
}

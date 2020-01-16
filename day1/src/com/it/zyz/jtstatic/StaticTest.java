package com.it.zyz.jtstatic;

/**
 * @author ljh
 * @create 2020-01-16 11:09
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese ch1=new Chinese();
        ch1.name="孙悟空";
        ch1.age=9999;
        Chinese ch2=new Chinese();
        ch2.name="二郎神";
        ch2.age=20000;
        ch1.nation="CHINA";
        System.out.println(ch2);
    }
}
class Chinese{
    String name;
    int age;

    static String nation;
}
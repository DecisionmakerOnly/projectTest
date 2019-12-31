package com.it.zyz.oop;

/**
 * @author ljh
 * @create 2019-12-30 16:57
 */
public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest ot=new OverLoadTest();
        ot.show(2);
        ot.show("ss","ssd");
        ot.show();
    }
    public void show(int i){

    }
//    public void show(String i){
//        System.out.println("show(String)");
//    }
    public void show(String ... i){
        System.out.println("show(String... str)");
    }
}

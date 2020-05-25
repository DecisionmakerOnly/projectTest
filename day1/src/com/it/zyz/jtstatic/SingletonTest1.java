package com.it.zyz.jtstatic;

/**
 * @author ljh
 * @create 2020-01-16 16:40
 */
public class SingletonTest1 {
    Bank bank1=Bank.getInstance();
    Bank bank2=Bank.getInstance();

}
//懒汉式
class Bank{
    //1、私有化类的构造器
    private Bank(){

    }
    //2、内部创建类的对象 此对象也要是静态的
    private static Bank instance=new Bank();
    //3、提供公共的方法返回类的对象
    public static Bank getInstance(){
        return  instance;
    }
}
package com.it.zyz.oop;

/**
 * @author ljh
 * @create 2020-01-02 11:17
 */
public class AnimalTest {
    public static void main(String[] args) {
        /**
         * 面向对象的特征一：封装于隐藏
         */
        Animal animal=new Animal();
        animal.name="孙悟空";
        animal.age=1;
//        animal.legs=-4;
        animal.setLegs(-10);
        animal.show();

    }
}
class Animal{
    String name;
    int age;
    private int legs;
    public void setLegs(int l){
        if(l>=0&&1%2==0){
            legs =1;
        }else {
            legs=0;
        }
    }
    public void eat(){
        System.out.println("动物进食！");
    }
    public void show(){
        System.out.println("name="+name+",age="+age+",legs="+legs);
    }

}
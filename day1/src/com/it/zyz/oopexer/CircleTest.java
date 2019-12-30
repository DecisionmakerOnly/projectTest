package com.it.zyz.oopexer;


/**
 * @author ljh
 * @create 2019-12-30 10:33
 */
public class CircleTest {
    //利用面向对象的编程方法,设计类Circle算圆的面积。
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=2.1;
        double area=c1.findArea();
        System.out.println(area);
    }
}
class Circle{
    //属性
    double radius;
    //求圆的面积
    public double findArea(){
        double area=Math.PI*radius*radius;
        return area;
    }
}

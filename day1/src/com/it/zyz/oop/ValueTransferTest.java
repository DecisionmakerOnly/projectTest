package com.it.zyz.oop;


/**
 * @author ljh
 * @create 2019-12-31 13:58
 */
public class ValueTransferTest {
    /**
     * 关于变量赋值
     */
    public static void main(String[] args) {
        System.out.println("==========基本数据类型===========");
        int m=10;
        int n=20;
        System.out.println("m="+m+"n="+n);
//        int temp=m;
//        m=n;
//        m=temp;
        ValueTransferTest vtf=new ValueTransferTest();
        vtf.swap(m,n);
        System.out.println("m="+m+"n="+n);
        System.out.println("===========引用数据类型===========");
        Order o1=new Order();
        o1.orderId=1001;
        Order o2=o1;//赋值以后o1和o2的地址值相同，都指向了堆空间中同一个对象实体。

        System.out.println("o1.orderId="+o1.orderId+"o2.orderId="+o2.orderId);
        o2.orderId=1002;
        System.out.println("o1.orderId="+o1.orderId+"o2.orderId="+o2.orderId);
    }
    public void swap(int m,int n){
        int temp=m;
        m=n;
        m=temp;
    }
//2020年第一天上班，我的愿望是能够找个好的工作。我想回家装修房子可是没有钱呀！
}
class Order{
    int orderId;
}

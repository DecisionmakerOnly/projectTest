package com.it.zyz.oop;

/**
 * @author ljh
 * @create 2020-01-02 9:36
 */
public class RecursionTest {
    public static void main(String[] args) {
        //方法一
        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            sum+=i;
        }
        System.out.println(sum);
        //方法二
        RecursionTest rit=new RecursionTest();
        int sum1=rit.getSum(100);
        System.out.println(sum1);
        System.out.println("*********************");
        int value=rit.f(10);
        System.out.println(value);
        System.out.println("**********************");
        int f2=rit.f1(7);
        System.out.println(f2);
    }
    public int getSum(int n){
        if(n==1){
            return 1;
        }else {
            return n+getSum(n-1);
        }
    }
    //已知有一个数列：f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),其中n是大于0的正数，求f(10)的值
    public int f(int n){
        if (n==0){
            return 1;
        }if(n==1){
            return 4;
        }else {
            return 2*f(n-1)+f(n-2);
        }
    }
    //斐波那数列
    public  int f1(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        return f1(n - 1) + f1(n - 2);
    }
}

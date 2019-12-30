package com.it.zyz.oopexer;

/**
 * @author ljh
 * @create 2019-12-30 10:52
 */
public class ExerTest {
    /**
     * 3.1编写程序,声明一个method方法,
     *    在方法中打印一个18*8的*型矩形,在main方法中调用该方法。
     * 3.2修改上一个程序,在method方法中,除打印一个18*8的*型矩形外,
     *    再计算该矩形的面积,并将其作为方法返回值。
     *    在main方法中调用该方法,接收返回的面积值并打印。
     * 3.3修改上一个程序,在method方法提供m和n两个参数,
     *    方法中打印一个m*n的*型矩形,并计算该矩形的面积,将其作为方法返回值。
     *    在main方法中调用该方法,接收返回的面积值并打印。
     */
    public static void main(String[] args) {
        ExerTest test=new ExerTest();
        //3.1
//        test.method();
        //3.2
//        int area=test.method();
//        System.out.println("面积为："+area);
//        3.3
//        int area=test.method(10,20);
//        System.out.println("面积为："+area);
        System.out.println(test.method(10,20));
    }
    //3.1
//    private void method(){
//        for (int i = 0; i <10 ; i++) {
//            for (int j=0;j<8;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    //3.2
//    public int method(){
//        for (int i = 0; i <10 ; i++) {
//            for (int j=0;j<8;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        return  10*8;
//
//    3.3
    public int method(int m,int n){
        for (int i = 0; i <m ; i++) {
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return  m*n;
    }
}

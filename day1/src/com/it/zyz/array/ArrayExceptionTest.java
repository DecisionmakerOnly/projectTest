package com.it.zyz.array;

/**
 * @author ljh
 * @create 2019-12-26 14:45
 */
public class ArrayExceptionTest {
    public static void main(String[] args) {
        /**
         * 数组中常见异常
         *1、数组角标越界异常：ArrayIndexOutOfBoundsExcetion
         *
         * 2、空指针异常：NullPointException
         */
//        int[] arr=new int[]{1,2,3,4,5,6};
//        for (int i = 0; i <=arr.length ; i++) {
//            System.out.print(arr[i]);
//        }
        //2、空指针异常：NullPointException
        //情况一：
//        int[] arr1=new int[]{2,1,3};
//        arr1=null;
//        System.out.println(arr1[0]);
        //情况二：
        int[][] arr2=new int[4][];
        System.out.println(arr2[0][0]);
    }
}

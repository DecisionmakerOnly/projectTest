package com.it.zyz.array;

import java.util.Arrays;

/**
 * @author ljh
 * @create 2019-12-26 13:50
 */
public class ArraysUtil {
    public static void main(String[] args) {
        //1、boolean equals(int [] a,int[] b)
        int[] array1=new int[]{1,2,3,4};
        int[] array2=new int[]{1,3,4,2};
        boolean isEquals= Arrays.equals(array1,array2);
        System.out.println(isEquals);
        //2、String toString(int[] a)
        //3、volid fill(int [] a ,int val)
        //4、void sort(int  [] a)
        //5、int binarySearch(int [] a,int key)
    }
}

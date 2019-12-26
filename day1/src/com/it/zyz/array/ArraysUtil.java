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
        System.out.println(Arrays.toString(array1));
        //3、volid fill(int [] a ,int val)
        Arrays.fill(array1,10);
        System.out.println(Arrays.toString(array1));
        //4、void sort(int  [] a)
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
        //5、int binarySearch(int [] a,int key)
        int[] array3=new int[]{11,23,54,66,78,93,222,334,777,987};
        int index=Arrays.binarySearch(array3,222);
        if (index>0){
            System.out.println(index);
        }else{
            System.out.println("未找到！");
        }

    }
}

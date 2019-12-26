package com.it.zyz.array;

/**
 * @author ljh
 * @create 2019-12-26 10:34
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr=new int[]{34,55,12,77,123,66,11,1,69,102,19,2};
        for (int i = 0; i <arr.length-1 ; i++) {
             for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
             }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
        //
    }

}

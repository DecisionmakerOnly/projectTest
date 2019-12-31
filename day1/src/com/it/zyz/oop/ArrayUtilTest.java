package com.it.zyz.oop;

/**
 * @author ljh
 * @create 2019-12-30 16:27
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil=new ArrayUtil();
        int[] arr=new int[]{32,123,654,432,12,34,7,3,7,888};
        int max=arrayUtil.getMax(arr);
        System.out.println("最大值为："+max);
        System.out.println("排序前");
        arrayUtil.print(arr);
        arrayUtil.sort(arr);
        System.out.println();
        System.out.println("排序后：");
        arrayUtil.print(arr);
        System.out.println("查找：");
        int index=arrayUtil.getIndex(arr,7);
        if(index>=0){
            System.out.println("找到了，索引地址："+index);
        }else{
            System.out.println("未找到");
        }
    }
}

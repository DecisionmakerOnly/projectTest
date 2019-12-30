package com.it.zyz.oopexer;

/**
 * @author ljh
 * @create 2019-12-30 13:15
 */
public class StudentTest {
    public static void main(String[] args) {
        /**
         * 4.对象数组题目:
         * 定义类Student,包含三个属性;学号number (int),年级state(int),成绩score(int)
         * 创建20个学生对象,学号为1到20,年级和成绩都由随机数确定。
         * 问题一:打印出3年级(state值为3)的学生信息。
         * 问题二:使用冒泡排序按学生成绩排序,并遍历所有学生信息提示：
         * 1)生成随机数: Math. random(),返回值类型double;
         * 2)四舍五入取整: Math.round (double d),返回值类型1ong.
         */
        //声明一个STUDENT类型的数组
        Student[] str =new Student[20];
        for (int i = 0; i <str.length ; i++) {
            //给数组元素赋值
            str[i]=new Student();
            //给Student对象属性赋值
            str[i].number=(i+1);
            str[i].state=(int)(Math.random()*(6-1+1)+1);
            str[i].score=(int)(Math.random()*(100-0+1));
        }
        //遍历学生数组
        for (int i = 0; i <str.length; i++) {
            System.out.println(str[i].info());
        }
        System.out.println("==========================");
        //问题一:打印出3年级(state值为3)的学生信息。
        for (int i = 0; i <str.length ; i++) {
            if(str[i].state==3){
                System.out.println(str[i].info());
            }
        }
        System.out.println("==========================");
        //问题二:使用冒泡排序按学生成绩排序,并遍历所有学生信息提示：
        for (int i = 0; i <str.length-1 ; i++) {
            for (int j=0;j<str.length-1-i;j++){
                //如果需要换序，交换的是数组的元素：student对象
                Student temp=str[j];
                str[j]=str[j+1];
                str[j+1]=temp;
            }
        }
        for (int i = 0; i <str.length; i++) {
            System.out.println(str[i].info());
        }
    }
}
class Student{
    int number;
    int state;
    int score;
    //显示学生信息
    public String info(){
        return "学号："+number+",年级："+state+",成绩"+score;
    }
}

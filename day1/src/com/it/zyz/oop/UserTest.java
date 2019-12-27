package com.it.zyz.oop;


/**
 * @author ljh
 * @create 2019-12-27 16:16
 */
public class UserTest {
    public static void main(String[] args) {
        User user=new User();
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.isMale);

        user.talk("河南话");
    }
}
class User{
    //属性（或成员变量）
    String name;
    int age;
    boolean isMale;

    public void talk(String language){//language：形参，也是局部变量
        System.out.println("我们使用："+language+"进行交流");
    }
    public void eat(){
        String food="桃子";//局部变量
        System.out.println("孙悟空喜欢吃"+food);
    }
}

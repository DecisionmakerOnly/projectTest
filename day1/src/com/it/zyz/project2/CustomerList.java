package com.it.zyz.project2;

/**
 * @author ljh
 * @create 2020-01-09 15:19
 */
public class CustomerList {
    private Customer[] customers; //用来保存客户对象的数组
    private int total=0;//记录已保存客户对象的数量

    /**
     * 用来初始化customers 数组的构造器
     * @param totalCustomers：指定数组的长度
     */
    public CustomerList(int totalCustomers){
        customers = new Customer[totalCustomers];
    }

    /**
     * 将指定的客户添加到数组中
     * @param customer
     * @return true：添加成功 false：添加失败
     */
    public boolean addCustomer(Customer customer){
        if(total >=customers.length){
            return false;
        }
//        customers[total]=customer;
//        total++;
        customers[total++]=customer;
        return true;
    }

    /**
     * 修改指定索引位置的客户信息
     * @param index
     * @param cust
     * @return true：修改成功 false：修改失败
     */
    public boolean replaceCustomer(int index,Customer cust){
        if(index <0 ||index >=total){
            return false;
        }

        customers[index]=cust;
        return true;
    }

    /**
     * 删除指定索引位置的客户
     * @param index
     * @return true：删除成功 false：删除失败
     */
    public boolean deleteCustomer(int index){
        if(index <0 ||index >=total){
            return false;
        }
        for (int i = index; i <total-1 ; i++) {
            customers[i]=customers[i+1];
        }
        //最后有数据的元素需要置空
//        customers[total-1]=null;
//        total--;
        customers[--total]=null;
        return true;
    }

    /**
     * 获取客户信息
     * @return
     */
    public Customer[] getAllCustomers(){
        Customer[] custs=new Customer[total];
        for (int i = 0; i <total ; i++) {
            custs[i]=customers[i];
        }
        return custs;
    }

    /**
     * 获取指定索引位置上的客户
     * @param index
     * @return 如果找到了元素,则返回;如果没有找到,则返回nul1
     */
    public Customer getCustomer(int index){
        if(index <0 ||index >=total){
            return null;
        }
        return customers[index];
    }

    /**
     * 获取存储的客户的数量
     * @return
     */
    public int getTotal(){
        return total;
    }
}
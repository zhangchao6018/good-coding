package com.demo.npe;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * <p>字符串 数组 集合使用过程中出现NPE</p>
 * @Author: zhangchao
 **/
@SuppressWarnings("all")
public class BasicUsageNpe {
    /**
     * 一定要遵循  常量.equals(变量)    保证equals调用方不为空
     *
     * @param x
     * @param y
     * @return
     */
    private static boolean stringEquals(String x , String y){
        return x.equals(y);
    }

    public static class User{
        private String name;
    }

    public static void main(String[] args) {
        //1.字符串
//        System.out.println(stringEquals("aaa",null));
//        System.out.println(stringEquals(null,"aaa"));

        //2.数组
        User[] users = new User[10];
        for (int i=0; i<10; i++){
            users[i] = new User();
            users[i].name = "array_"+i;
        }

        //3. List对象addAll传递null 会抛出空指针
        List<User> userList = new ArrayList<>(10);
        User user = null;
        List<User> userList_ = null;
        userList.add(user);
        userList_.addAll(userList_);

    }
}

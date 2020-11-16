package com.demo.exception;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class UnboxingNpe {
    public static void sum(int x , int y){
        System.out.println(x+y);
    }

    public static boolean compare(long x , long y){
        return x >= y;
    }
    public static void main(String[] args) {
        // 1.变量赋值自动拆箱出现的空指针
        //javac UnboxingNpe.java
        //javap -c UnboxingNpe.class
        Long count = null;
        long count_ = count;

        // 2.方法传参时自动拆箱引发的空指针
//        Integer left = null;
//        Integer right = null;
//        sum(left,right);

        // 3.用于大小比较的场景
//        Long a = null;
//        Long b = null;
//        compare(a,b);
    }
}

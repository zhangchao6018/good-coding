package com.demo.ifelse;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * 描述:
 *
 * @Author: zhangchao22
 * @Date: 2020/4/3 10:42
 **/
public class IfElseDemo {


    @Test
    public void test(){
        //ifElse("1");
        version1("2");
    }

    /**
     * ifElse改造1
     * @param param
     */
   public void version1(String param){
       //这里的Function 参数类型可根据实际的入参,返参变更
       Map<String, Function<String ,String>> actionMappings = new HashMap<>();

       // When init...
       actionMappings.put("1", (someparam) ->  doAction1(someparam));
       actionMappings.put("2", (someparam) ->  doAction2(someparam));
       actionMappings.put("3", (someparam) ->  doAction3(someparam));
       actionMappings.put("4", (someparam) ->  doAction4(someparam));

       // 省略 null 判断 -> 这里是真正的执行逻辑
       actionMappings.get(param).apply(param);
   }

    /**
     * ifElse传统写法
     * @param param
     */
    public void ifElse(String param){

        if (param.equals("1")) {
            doAction1(param);
        } else if (param.equals("2")) {
            doAction2(param);
        } else if (param.equals("3")) {
            doAction3(param);
        }else if (param.equals("4")){
            doAction4(param);
        }
    }

    /**
     * 计税函数
     * @param income
     * @return
     */
    public double ifElseAction2(double income){
        double tax;
         if (income <= 2200)
           tax = 0;
         else if (income <= 2700)
           tax = 0.14 * (income - 2200);
         else if (income <= 3200)
           tax = 70 + 0.15 * (income - 2700);
         else if (income <= 3700)
           tax = 145 + 0.16 * (income - 3200);
         else
           tax = 53090 + 0.7 * (income - 102200);
         return tax;
    }


    private String doAction4(String param) {
        System.out.println("do condition 4 ...");
        return param;
    }
    private String doAction3(String param) {
        System.out.println("do condition 3 ...");
        return param;
    }

    private String doAction2(String param) {
        System.out.println("do condition 2 ...");
        return param;
    }

    private String doAction1(String param) {
        System.out.println("do condition 1 ...");
        return param;
    }
}

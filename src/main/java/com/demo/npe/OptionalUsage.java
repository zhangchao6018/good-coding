package com.demo.npe;

import java.util.Optional;

/**
 * 描述:
 *<p>用optional规避空指针</p>
 * @Author: zhangchao
 **/
@SuppressWarnings("all")
public class OptionalUsage {
    private static class User{

        private String name;

        private String getName(){
            return this.name;
        }

    }

    public static void main(String[] args) {
        // 1.没有意义的用法
        isUserEqualNull();

        // 2.正确的打开方式
        User user = null;
        Optional<User> userOptional = Optional.ofNullable(user);

        // 存在即返回,没有
        User result = userOptional.orElse(new User());
        // 存在即返回,没有则调用方法返回
        User result1 = userOptional.orElseGet(() -> defaultGet());
        // 存在即返回,没有则抛异常
        //User result2 = userOptional.orElseThrow( RuntimeException::new );

        // 存在才去做相应的处理
        userOptional.ifPresent(u -> System.out.println(u.name));

        //对optional的对象进行某种操作,并且返回一个optional对象
        String nameRes = userOptional.map(u -> u.getName()).orElse("default");
        System.out.println(nameRes);
        //map无限级联操作
        Integer nameLength = userOptional.map(u -> u.getName()).map(name -> name.length()).orElse(0);
        System.out.println(nameLength);

    }

    private static User defaultGet() {
        User user = new User();
        user.name = "张三";

        return user;
    }

    private static void isUserEqualNull() {
        User user = null;
        if (user != null){
            System.out.println("User is not null");
        }else {
            System.out.println("User is  null");
        }

        Optional<User> optionalUser = Optional.empty();
        if (!optionalUser.isPresent()) {
            System.out.println("User is not null");
        }else {
            System.out.println("User is  null");
        }
    }
}

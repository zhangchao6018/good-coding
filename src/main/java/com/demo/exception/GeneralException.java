package com.demo.exception;

import com.google.common.base.Enums;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 描述:
 * <h1>编码中的常见的异常</h1>
 * @Author: zhangchao
 **/
public class GeneralException {
    public static class User {

        private String name;

        public User() {}

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    public static class Manager extends User {}

    public static class Worker extends User {}


    private static final Map<String,StaffType> indexMap = new HashMap<>(StaffType.values().length);

    static {
        for (StaffType item : StaffType.values()) {
            indexMap.put(item.name(),item);
        }
    }
    public static void main(String[] args) {
        // 1.不要在for循环内删除元素(并发修改异常)
        //dontModificateCollectionInLoop();

        // 2.类型转换异常
        //classCastException();

        // 3.枚举查找异常
        enumFind();
    }

    private static void enumFind() {
        System.out.println(enumFind("RD"));
        System.out.println(enumFind("abc"));
        System.out.println(enumFind(null));
    }

    private static StaffType enumFind(String type) {
        // 1.未检查
//        return StaffType.valueOf(type);

        // 2.最简单的方式(循环)
//        for (StaffType staffType : StaffType.values()) {
//            if (staffType.name().equals(type)){
//                return staffType;
//            }
//        }
//        return null;

        // 3.索引(类加载时索引枚举)
//        return indexMap.get(type);

        // 4.使用 Google Guava Enums, 需要相关的依赖
        return Enums.getIfPresent(StaffType.class, type).orNull();
    }

    private static void classCastException() {
        User user1 = new Manager();
        User user2 = new Worker();

        // 2.1 类型转换异常
//        Manager m1 = (Manager) user1;
//        Manager m2 = (Manager) user2;


        // 2.2 如果你不知道具体类型    instanceof
        System.out.println(user1.getClass().getName());
        if (user1 instanceof Manager){
            System.out.println("ok");
        }

    }

    private static void dontModificateCollectionInLoop() {
        // 1.1
//        ArrayList<User> users = new ArrayList<User>(Arrays.asList(new User("qinyi"), new User("zc")));
//        for (User user : users) {
//            if (user.name.equals("zc"))
//                users.remove(user);
//        }

        // 1.2
//        ArrayList<User> users2 = new ArrayList<User>(Arrays.asList(new User("qinyi"), new User("zc")));
//        for (User user : users2) {
//            if (user.name.equals("zc"))
//                users2.add(new User("zhangsan"));
//        }

        // 1.3 如果一定要修改,请用迭代器
//        ArrayList<User> users3 = new ArrayList<User>(Arrays.asList(new User("qinyi"), new User("zc")));
//        Iterator<User> iterator = users3.iterator();
//        while (iterator.hasNext()){
//            if ("zc".equals(iterator.next().name)){
//                iterator.remove();
//            }
//        }
        // 1.4 不能先remove再hasNext
//        ArrayList<User> users4 = new ArrayList<User>(Arrays.asList(new User("qinyi"), new User("zc")));
//        Iterator<User> iterator4 = users4.iterator();
//        while (iterator4.hasNext()){
//            iterator4.remove();
//            if ("zc".equals(iterator4.next().name)){
//                System.out.println("11");
//            }
//        }

        // 建议不修改原来的collection而用stream筛选


        ArrayList<User> users5 = new ArrayList<User>(Arrays.asList(new User("qinyi"), new User("zc")));

        List<User> res = users5.stream().filter(item -> "zc".equals(item.name)).collect(Collectors.toList());


    }
}

package com.demo.stream.cases;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 类名称：CaseThree
 * ********************************
 * <p>
 * 类描述：案例三
 * 重点讲解：flatMap的使用方式
 *
 * @author zhangxiaoxi
 * @date 下午9:50
 */
public class CaseThree {

    /**
     * 角色
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class Role {
        /**
         * 权限列表
         */
        private List<Permission> permissions;
    }
    /**
     * 权限
     */
    @Data
    @AllArgsConstructor
    class Permission {
        /**
         * 权限名称
         */
        private String name;
    }

    /**
     * 用户角色列表
     */
    List<Role> roleList;

    @Before
    public void init() {
        roleList = new ArrayList();

        Role adminRole = new Role();
        List<Permission> adminPermissionList = Lists.newArrayList(
                new Permission("删除"),
                new Permission("查看"),
                new Permission("导出"));
        adminRole.setPermissions(adminPermissionList);

        Role userRole = new Role();
        List<Permission> userPermissionList = Lists.newArrayList(
                new Permission("新建"),
                new Permission("修改"),
                new Permission("删除"),
                new Permission("查看"));
        userRole.setPermissions(userPermissionList);

        roleList.add(adminRole);
        roleList.add(userRole);
    }

    @Test
    public void findPermission() {
        //错误写法:
        roleList.stream()
                .forEach(role -> role.permissions.stream()
                .map(per -> per.getName())
                        .distinct().forEach(System.out::println)
                );

        //正确:
        System.out.println("----------------------------");
        List<Permission> collect = roleList.stream()

                // TODO 扁平化MAP 获取对象中的集合类属性，组成一个新的流
                .flatMap(role -> role.getPermissions().stream())

                // peek 与 forEach 类似，区别是用在中间过程中，后面可以接其他操作
                .peek(permission ->
                        System.out.println("新的流元素：" + permission))

                .distinct()
//                .forEach(permission -> System.out.println(permission));
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}

package com.demo.stream.cases;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * 类名称：CaseTwo
 * ********************************
 * <p>
 * 类描述：案例二
 * 重点讲解：filter和distinct的使用方式
 *
 * @author zhangxiaoxi
 * @date 下午9:39
 */
public class CaseTwo {

    /**
     * 用户请求的创建标签模型
     */
    @Data
    @AllArgsConstructor
    class TagReqDTO {
        /**
         * 标签名字
         */
        private String name;
        /**
         * 标签值：年龄
         */
        private Integer age;
    }

    /**
     * 从DB中查询出来的已经存在的标签名
     */
    List<String> tagListFromDB;
    /**
     * 用户请求的标签列表
     */
    List<TagReqDTO> tagListFromReq;

    @Before
    public void init() {
        // 数据库中存在的标签名列表
        tagListFromDB = Lists.newArrayList(
                "李四", "王五", "赵六");

        // 用户提交的
        tagListFromReq = Lists.newArrayList(
                new TagReqDTO("张三", 10),
                new TagReqDTO("李四", 30),
                new TagReqDTO("张三", 11));
    }


    @Test
    public void distinctTag() {

        tagListFromReq.stream()

                // TODO true:通过测试，数据不过滤；false:未通过测试，数据被过滤
                .filter(tag -> !tagListFromDB.contains(tag.getName()))

                // TODO 使用equals对元素进行比较
                .distinct()
                .forEach(tag -> System.out.println(tag));

    }

}

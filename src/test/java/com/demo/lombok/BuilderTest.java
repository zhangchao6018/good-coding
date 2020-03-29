package com.demo.lombok;

import com.alibaba.fastjson.JSON;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

/**
 * 类名称：BuilderTest
 * ********************************
 * <p>
 * 类描述：@Builder和@Singular注解
 *
 * TODO 总结一下
 * @Builder注解帮助我们完成的工作：
 * 1. 一个名为XxxBuilder的内部静态类，成为构建器
 * 2. 构建器中，对于目标类的所有属性和未初始化的final字段，都会在构建器中创建对应的属性
 * 3. 构建器中，对每个属性都会创建一个同名的方法，用于为此属性赋值。并且支持链式调用
 * 4. 构建器中，build方法会根据设置的属性值来创建实体对象
 * 5. 实体类中，生成所有属性和未初始化的final字段的构造方法
 * 6. 实体类中，会创建builder方法，用来生成构建器
 *
 * @Singular注解帮助我们完成的工作：
 * 1. 构建器中，生成一个向集合添加单个元素的方法
 * 2. 构建器中，生成一个向集合添加另一个集合的方法
 * 3. 构建器中，生成一个清除集合元素的方法
 * 4. build方法创建集合时，将根据集合元素多少创建不同的集合，并且创建的集合都是不可变的
 *
 * @author zhangxiaoxi
 * @date 下午6:13
 */
@Builder
@Data
public class BuilderTest {

    /**
     * 静态属性：不能赋值的
     */
    private static String staticField;

    /**
     * final属性
     */
    private final String finalField;

    /**
     * 已初始化的Final字段：不能赋值的
     */
    private final String initFinalField = "已初始化的Final字段！";

    /**
     * 普通属性
     */
    private String field = "普通属性Field!";

    /**
     * 集合类属性
     */
    @Singular
    private List<String> listFields;

    /**
     * main
     * @param args
     */
    public static void main(String[] args) {
        BuilderTest builderTest = BuilderTest

                // builder创建一个可以链式赋值的对象
                .builder()

                // 为这个对象的"每个"字段赋值
                .finalField("手动赋值FinalField字段")
//                .field("手动赋值Field字段")
//                .listFields(new ArrayList<>())
                .listField("zhangxiaoxi")
                .listField("lisi")

                // build方法来创建对象。
                // TODO 完成了对象的创建。此时创建出来的对象，是不可变的！！！
                .build();

        System.out.println(
                JSON.toJSONString(builderTest, true));
    }

}

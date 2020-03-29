package com.demo.stream.cases;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 类名称：CaseFive
 * ********************************
 * <p>
 * 类描述：案例五
 * 重点讲解：sort和compare的使用方式
 *
 * @author zhangxiaoxi
 * @date 下午10:32
 */
public class CaseFive {

    /**
     * 交易实体模型
     */
    @Data
    @AllArgsConstructor
    class Trade {
        // 下单价格
        private BigDecimal price;
        // 下单时间
        private LocalDateTime time;
        // 下单量
        private Integer count;
        // 下单类型：机构 / 个人
        private String type;
    }

    /**
     * 一段时间内的交易申请
     */
    List<Trade> trades;

    @Before
    public void init() {
        trades = new ArrayList<>();

        trades.add(new Trade(new BigDecimal(100),
                // 在当前时间的基础上添加 1 秒
                LocalDateTime.now().plusSeconds(1),
                500, "机构"));
        trades.add(new Trade(new BigDecimal(101),
                LocalDateTime.now().plusSeconds(2),
                1, "个人"));
        trades.add(new Trade(new BigDecimal(101),
                LocalDateTime.now().plusSeconds(1),
                1, "个人"));
        trades.add(new Trade(new BigDecimal(100),
                LocalDateTime.now().plusSeconds(1),
                500, "个人"));
        trades.add(new Trade(new BigDecimal(100),
                LocalDateTime.now().plusSeconds(0),
                2, "个人"));
        trades.add(new Trade(new BigDecimal(100),
                LocalDateTime.now().plusSeconds(0),
                100, "机构"));
    }

    @Test
    public void sortTrade() {

        System.out.println("排序前数据~~~\n" + JSON.toJSONString(trades, true));

        List<Trade> sorted = trades.stream()
                .sorted(
                        Comparator
                                // 首先按照价格排序
                                .comparing(
                                        Trade::getPrice,
                                        // TODO 进行排序调整，将自然排序翻转
                                        Comparator.reverseOrder())

                                // 时间先后进行排序，自然排序
                                .thenComparing(Trade::getTime)

                                // 交易量排序，自然排序翻转
                                .thenComparing(
                                        Trade::getCount,
                                        Comparator.reverseOrder())

                                // 自定义排序规则
                                .thenComparing(
                                        // 要排序的字段值
                                        Trade::getType,

                                        // 自定义排序规则
                                        (type1, type2) -> {
                                            if ("机构".equals(type1) && "个人".equals(type2)) {
                                                // -1:type1在先， type2在后
                                                return -1;
                                            } else if ("个人".equals(type1) && "机构".equals(type2)) {
                                                return 1;
                                            } else {
                                                return 0;
                                            }
                                        }))
                .collect(Collectors.toList());

        System.out.println("排序后结果~~~\n" + JSON.toJSONString(sorted, true));
    }
}

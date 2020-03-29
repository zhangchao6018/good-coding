package com.demo.stream.cases;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 类名称：CaseFour
 * ********************************
 * <p>
 * 类描述：案例四
 * 重点讲解：group的使用方式
 *
 * @author zhangxiaoxi
 * @date 下午8:39
 */
public class CaseFour {

    @Data
    @AllArgsConstructor
    class Order {
        /**
         * 订单编号
         */
        private Integer orderId;
        /**
         * 账户编号
         */
        private String accountId;
    }

    /**
     * 模拟数据库查询
     * @param accountIds
     * @return
     */
    public List<Order> selectFromDB(List<String> accountIds) {
        List<Order> orderList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            orderList.add(
                    new Order(i,
                            accountIds.get(i % accountIds.size())));
        }
        return orderList;
    }

    /**
     * 接口
     * @param accountIds
     * @return
     */
    public Map<String, List<Order>> queryOrderByAccountIds(
            List<String> accountIds) {

        return Optional.ofNullable(selectFromDB(accountIds))
                .map(List::stream)
                .orElseGet(Stream::empty)

                // TODO group分组功能
                .collect(Collectors.groupingBy(
                        order -> order.getAccountId()));
    }

    @Test
    public void test() {
        Map<String, List<Order>> orders =
                queryOrderByAccountIds(
                        Lists.newArrayList("张三", "李四", "王五"));

        System.out.println(JSON.toJSONString(orders, true));
    }
}

package com.demo.lambda.cart;

import com.alibaba.fastjson.JSON;
import com.demo.lambda.CartService;
import com.demo.lambda.Sku;
import com.demo.lambda.SkuCategoryEnum;
import org.junit.Test;

import java.util.List;

public class Version2Test {

    @Test
    public void filterSkusByCategory() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 查找购物车中图书类商品集合
        List<Sku> result = CartService.filterSkusByCategory(
                cartSkuList, SkuCategoryEnum.BOOKS);

        System.out.println(JSON.toJSONString(
                result, true));
    }

}

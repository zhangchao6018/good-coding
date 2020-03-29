package com.demo.lambda.cart;

import com.alibaba.fastjson.JSON;
import com.demo.lambda.CartService;
import com.demo.lambda.Sku;
import com.demo.lambda.SkuBooksCategoryPredicate;
import org.junit.Test;

import java.util.List;

public class Version4Test {

    @Test
    public void filterSkus() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 过滤书本类型的
        List<Sku> result = CartService.filterSkus(cartSkuList,new SkuBooksCategoryPredicate());

        System.out.println(JSON.toJSONString(result, true));
    }

}

package com.demo.lambda.cart;

import com.alibaba.fastjson.JSON;
import com.demo.lambda.CartService;
import com.demo.lambda.Sku;
import org.junit.Test;

import java.util.List;

public class Version6Test {

    @Test
    public void filterSkus() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 过滤商品总价大于2000的商品
        List<Sku> result = CartService.
                filterSkus(cartSkuList,sku-> sku.getTotalPrice()>2000);
        System.out.println(JSON.toJSONString(result, true));
    }

}

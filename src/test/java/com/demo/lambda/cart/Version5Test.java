package com.demo.lambda.cart;

import com.alibaba.fastjson.JSON;
import com.demo.lambda.CartService;
import com.demo.lambda.Sku;
import com.demo.lambda.SkuPredicate;
import org.junit.Test;

import java.util.List;

public class Version5Test {

    @Test
    public void filterSkus() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 过滤商品总价大于2000的商品
        List<Sku> result = CartService.filterSkus(cartSkuList, new SkuPredicate() {
            public boolean filterSkus(Sku sku) {
                return sku.getTotalPrice()>2000?true:false;
            }
        });

        System.out.println(JSON.toJSONString(result, true));
    }

}

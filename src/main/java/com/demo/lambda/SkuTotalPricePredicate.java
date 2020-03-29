package com.demo.lambda;

/**
 * @Description:
 * @Author: zhangchao
 * @Date: 3/28/20 8:36 下午
 **/
public class SkuTotalPricePredicate implements SkuPredicate {
    public boolean filterSkus(Sku sku) {
        return sku.getTotalPrice()>2000?true:false;
    }
}

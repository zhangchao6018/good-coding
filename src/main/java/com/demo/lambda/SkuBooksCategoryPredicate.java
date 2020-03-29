package com.demo.lambda;

/**
 * @Description:
 * @Author: zhangchao
 * @Date: 3/28/20 8:23 下午
 **/
public class SkuBooksCategoryPredicate implements SkuPredicate {

    public boolean filterSkus(Sku sku) {
        return SkuCategoryEnum.BOOKS.equals(sku.getSkuCategory())?true:false;
    }
}

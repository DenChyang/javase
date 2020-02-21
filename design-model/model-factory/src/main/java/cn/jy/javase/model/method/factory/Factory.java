package cn.jy.javase.model.method.factory;

import cn.jy.javase.model.method.product.Product;

/**
 * @author Chyang.Wu
 * @date 2020/02/21 12:03
 */
public interface Factory {

    /**
     * 生产产品的方法
     * @return
     */
    Product create();
}

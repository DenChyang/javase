package cn.jy.javase.model.method.factory;

import cn.jy.javase.model.method.product.Product;
import cn.jy.javase.model.method.product.ProductA;

/**
 * @author Chyang.Wu
 * @date 2020/02/21 12:04
 */
public class FactoryA implements Factory {
    public Product create() {
        return new ProductA();
    }
}

package cn.jy.javase.model.method.factory;

import cn.jy.javase.model.method.product.Product;
import cn.jy.javase.model.method.product.ProductB;

/**
 * @author Chyang.Wu
 * @date 2020/02/21 12:06
 */
public class FactoryB implements Factory {
    public Product create() {
        return new ProductB();
    }
}
package cn.jy.javase.model.abstractFactory.factory;

import cn.jy.javase.model.abstractFactory.Attach;
import cn.jy.javase.model.abstractFactory.AttachB;
import cn.jy.javase.model.abstractFactory.product.Product;
import cn.jy.javase.model.abstractFactory.product.ProductB;

/**
 * @author Chyang.Wu
 * @date 2020/02/21 12:06
 */
public class FactoryB implements Factory {
    /**
     * 生产附件的方法
     *
     * @return
     */
    public Attach createAttach() {
        return new AttachB();
    }

    public Product create() {
        return new ProductB();
    }
}
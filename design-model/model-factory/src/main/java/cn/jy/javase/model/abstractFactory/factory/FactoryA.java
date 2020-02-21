package cn.jy.javase.model.abstractFactory.factory;


import cn.jy.javase.model.abstractFactory.Attach;
import cn.jy.javase.model.abstractFactory.AttachA;
import cn.jy.javase.model.abstractFactory.product.Product;
import cn.jy.javase.model.abstractFactory.product.ProductA;

/**
 * @author Chyang.Wu
 * @date 2020/02/21 12:04
 */
public class FactoryA implements Factory {
    public Product create() {
        return new ProductA();
    }

    /**
     * 生产附件的方法
     *
     * @return
     */
    public Attach createAttach() {
        return new AttachA();
    }
}

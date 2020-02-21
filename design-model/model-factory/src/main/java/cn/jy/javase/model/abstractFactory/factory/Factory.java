package cn.jy.javase.model.abstractFactory.factory;


import cn.jy.javase.model.abstractFactory.Attach;
import cn.jy.javase.model.abstractFactory.product.Product;

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

    /**
     * 生产附件的方法
     * @return
     */
    Attach createAttach();
}

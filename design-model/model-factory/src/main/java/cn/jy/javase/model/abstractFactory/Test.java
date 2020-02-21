package cn.jy.javase.model.abstractFactory;

import cn.jy.javase.model.abstractFactory.factory.Factory;
import cn.jy.javase.model.abstractFactory.factory.FactoryA;
import cn.jy.javase.model.abstractFactory.factory.FactoryB;
import cn.jy.javase.model.abstractFactory.product.Product;

/**
 * @author Chyang.Wu
 * @date 2020/02/21 12:47
 */
public class Test {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Product product = factoryA.create();
        Attach attach = factoryA.createAttach();
        product.print();
        attach.print();

        FactoryB factoryB = new FactoryB();
        Product productB = factoryB.create();
        Attach attachB = factoryB.createAttach();
        productB.print();
        attachB.print();
    }
}

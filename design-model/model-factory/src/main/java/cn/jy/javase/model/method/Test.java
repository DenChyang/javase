package cn.jy.javase.model.method;

import cn.jy.javase.model.method.factory.Factory;
import cn.jy.javase.model.method.factory.FactoryA;
import cn.jy.javase.model.method.factory.FactoryB;
import cn.jy.javase.model.method.product.Product;

/**
 * @author Chyang.Wu
 * @date 2020/02/21 12:08
 */
public class Test {
    /**
     * 工厂方法模型，测试
     * @param args
     */
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Product product = factoryA.create();
        product.print();

        FactoryB factoryB = new FactoryB();
        Product productB = factoryB.create();
        productB.print();
    }
}

package cn.jy.javase.model.simple;

/**
 * @author Chyang.Wu
 * @date 2020/02/21 09:45
 */
public class SimpleFactory {

    /**
     * 生产产品的方法
     * 开闭原则：ocp
     * @param type
     * @return
     */
    public static Product create(String type) {
        if ("A".equals(type)) {
            return new ProductA();
        } else if ("B".equals(type)) {
            return new ProductB();
        }
        return null;
    }

    /**
     * 测试
     * 缺陷：扩展难，需要手改代码
     * @param args
     */
    public static void main(String[] args) {
        Product product = create("A");
        product.print();

        product = create("B");
        product.print();
    }

}

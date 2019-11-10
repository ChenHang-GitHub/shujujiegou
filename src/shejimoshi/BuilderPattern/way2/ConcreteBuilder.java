package shejimoshi.BuilderPattern.way2;


/**
 * @ClassName: ConcreteBuilder
 * @author: csh
 * @date: 2019/11/3  16:14
 * @Description: 具体建造者（工人）：描述具体建造者，并实现抽象建造者公共接口。
 */

public class ConcreteBuilder extends Builder {
    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    Product build() {
        return product;
    }

    @Override
    Builder bulidA(String mes) {
        product.setBuildA(mes);
        return this;
    }

    @Override
    Builder bulidB(String mes) {
        product.setBuildB(mes);
        return this;
    }

    @Override
    Builder bulidC(String mes) {
        product.setBuildC(mes);
        return this;
    }

    @Override
    Builder bulidD(String mes) {
        product.setBuildD(mes);
        return this;
    }
}

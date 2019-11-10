package shejimoshi.BuilderPattern.way1;

/**
 * @ClassName: ConcreteBuilder
 * @author: csh
 * @date: 2019/11/3  16:14
 * @Description:   具体建造者（工人）：描述具体建造者，并实现抽象建造者公共接口。
 */

public class ConcreteBuilder  extends   Builder{

    private Product product;
    public ConcreteBuilder() {
        product = new Product();
    }
    @Override
    void bulidA() {
        product.setBuildA("地基");
    }

    @Override
    void bulidB() {
        product.setBuildB("钢筋工程");
    }

    @Override
    void bulidC() {
        product.setBuildC("铺电线");
    }

    @Override
    void bulidD() {
        product.setBuildD("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }

    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        concreteBuilder.set();
//        int i = concreteBuilder.i;

        Builder builder =  new ConcreteBuilder();
        builder.set();
//        int i1 = builder.i;

    }
}

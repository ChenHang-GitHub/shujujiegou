package shejimoshi.BuilderPattern.way1;

/**
 * @ClassName: Director
 * @author: csh
 * @date: 2019/11/3  16:24
 * @Description:  指挥者（Director）：调用具体建造者来创建复杂对象（产品）的各个部分，并按照一定顺序（流程）来建造复杂对象。
 */
public class Director {
    //指挥工人按顺序造房
    public  Product  create(Builder builder)
    {
        builder.bulidA();
        builder.bulidB();
        builder.bulidC();
        builder.bulidD();
        return builder.getProduct();
    }
}

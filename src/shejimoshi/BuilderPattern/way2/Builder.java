package shejimoshi.BuilderPattern.way2;

/**
 * @ClassName: Builder
 * @author: csh
 * @date: 2019/11/3  16:11
 * @Description:     描述 具体建造者 的公共接口，一般用来定义建造细节的方法，并不涉及具体的对象部件的创建。
 */
abstract class Builder {
    //汉堡
    abstract Builder bulidA(String mes);
    //饮料
    abstract Builder bulidB(String mes);
    //薯条
    abstract Builder bulidC(String mes);
    //甜品
    abstract Builder bulidD(String mes);
    //获取套餐
    abstract shejimoshi.BuilderPattern.way2.Product build();
}

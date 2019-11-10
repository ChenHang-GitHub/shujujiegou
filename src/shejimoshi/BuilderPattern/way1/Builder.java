package shejimoshi.BuilderPattern.way1;

/**
 * @ClassName: Builder
 * @author: csh
 * @date: 2019/11/3  16:11
 * @Description:     描述 具体建造者 的公共接口，一般用来定义建造细节的方法，并不涉及具体的对象部件的创建。
 */
abstract class Builder {
    //地基
    abstract void bulidA();
    //钢筋工程
    abstract void bulidB();
    //铺电线
    abstract void bulidC();
    //粉刷
    abstract void bulidD();
    //完工-获取产品
    abstract Product getProduct();

    public int i = 1;
//    test
    public  void  set (){
        System.out.println("Bulid"+i);
    }
}

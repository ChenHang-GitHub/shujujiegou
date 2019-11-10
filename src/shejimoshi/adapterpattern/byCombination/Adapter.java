package shejimoshi.adapterpattern.byCombination;

/*
 * 适配器模式 实现的方法2   通过组合的方式 （解决缺点：java 只支持单继承 ）*/
public class Adapter extends Adaptee implements Target {
    //这里需要extends  吗 ？
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}

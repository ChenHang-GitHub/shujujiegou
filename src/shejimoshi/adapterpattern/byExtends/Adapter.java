package shejimoshi.adapterpattern.byExtends;
/*
* 适配器模式 实现的方法1   通过继承 （缺点：java 只支持单继承 ）*/
public class Adapter extends  Adaptee  implements  Target {
    @Override
    public void handleReq() {
        super.request();
    }
}

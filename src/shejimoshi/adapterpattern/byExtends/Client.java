package shejimoshi.adapterpattern.byExtends;
/*
eg：完成让电脑 可以适配 游戏机键盘
Client ：相当于电脑
* */
public class Client {
    public  void  handle(Target target)
    {
        // 通过调用适配器的方法，来调用adaptee 的方法  实现转换
         target.handleReq();
    }

    public static void main(String[] args) {
        //电脑
        Client client = new Client();
        //被适配的对象 （游戏机键盘）
        Adaptee adaptee=new Adaptee();
        //适配器
        Adapter adapter = new Adapter();
        //用适配器完成适配
        client.handle(adapter);


    }
}

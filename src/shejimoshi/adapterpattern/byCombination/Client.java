package shejimoshi.adapterpattern.byCombination;

/*
eg：完成让电脑 可以适配 游戏机键盘
Client ：相当于电脑

常用:  旧系统升级新系统

字节流 转换成 字符流 new InputStreamReader(new InputStream)   
* */
public class Client {
    public  void  handle(Target target)
    {
        //调用适配器的方法
         target.handleReq();
    }

    public static void main(String[] args) {
        //电脑
        Client client = new Client();
        //被适配的对象 （游戏机键盘）
        Adaptee adaptee=new Adaptee();
        //适配器
        Adapter adapter = new Adapter(adaptee);
        //用适配器完成适配
        client.handle(adapter);


    }
}

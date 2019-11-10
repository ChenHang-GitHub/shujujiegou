package threadLeaning.syn;

/**
 * @ClassName: Acount
 * @author: csh
 * @date: 2019/11/8  13:59
 * @Description:    写加锁 读不加锁 可能会产生 脏读 的现象（写还未提交 就开始读了 读到是还没有提交前的数据）
 */
public class Acount {
    String name;
    double balance;         //基本数据double 初始值0.0

    public  synchronized  void  set(String name ,Double balance){
        this.name =name;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.balance=balance;
    }

    public   /*synchronized */double getBalance(String name)
    {
        return this.balance;
    }
    public static void main(String[] args) throws InterruptedException {

        Acount acount = new Acount();
        new Thread(()->acount.set("a",100.0)).start();
        Thread.sleep(1000);
        double balance = acount.getBalance("");
        System.out.println(balance);
    }
}

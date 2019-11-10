package threadLeaning.syn;

/**
 * @ClassName: Test4
 * @author: csh
 * @date: 2019/11/8  14:19
 * @Description:
 * 一个同步方法可以调用另外一个同步方法 。
 * 调用一个同步方法 线程已经拥有某个对象的锁了，再次申请时仍然会得到该对象的锁。
 * 也就是说synchronized获得的锁是 可重入的
 *
 * 这是继承中 可能会发生的情形  ，子类调用父类的同步方法 (也是没有问题的,不会造成死锁问题)
 */
public class Test5 {
    //this ==1
    synchronized void m1 (){
        System.out.println("super class");
    }

    public static void main(String[] args) {
        new TT().m1();
    }
}


class  TT extends  Test5{

    @Override
    synchronized void m1() {
        super.m1();  //调用父类的方法
    }
}
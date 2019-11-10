package threadLeaning.syn;

/**
 * @ClassName: Test4
 * @author: csh
 * @date: 2019/11/8  14:19
 * @Description:
 * 一个同步方法可以调用另外一个同步方法 。
 * 调用一个同步方法 线程已经拥有某个对象的锁了，再次申请时仍然会得到该对象的锁。
 * 也就是说synchronized获得的锁是 可重入的
 */
public class Test4 {
    //this ==1
    synchronized void m1 (){
        System.out.println("m1");
        m2();
    }
    //this ==2
    synchronized void  m2(){
        System.out.println("m2");
    }
}
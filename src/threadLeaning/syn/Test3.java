package threadLeaning.syn;

/**
 * @ClassName: Test3
 * @author: csh
 * @date: 2019/11/8  11:54
 * @Description:       一个线程方法的执行过程中 其他线程 可以 执行他的非线程方法
 */
public class Test3 {

    public  synchronized  void  m1()   {
        System.out.println(Thread.currentThread().getName() +"process");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

    public  void  m2()   {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"m2");
    }


    public static void main(String[] args)throws Exception {
        Test3 test3 = new Test3();
//        new Thread(()->test3.m1()).start();
//        new Thread(()->test3.m2()).start();

        new Thread(test3::m1).start();
        new Thread(test3::m2).start();
    }
}

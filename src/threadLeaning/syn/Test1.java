package threadLeaning.syn;

/**
 * @ClassName: Test
 * @author: csh
 * @date: 2019/11/8  11:09
 * @Description:  synchronized  static  锁的是这个类.class
 */
public class Test1 {

    private static int count = 10;

    public  static void  m()
    {
        synchronized (Test1.class)       //静态的方法不需要new 出对象来就可以访问的  所以不能用synchronized(this)
        {
            while (count>0)
            {
                count--;
                System.out.println(Thread.currentThread().getName()+" " +count);
            }
        }
    }

    //     等同于上面的代码
//    public  synchronized  static void  m(){
//
//    }

    public static void main(String[] args) throws InterruptedException {

        Test1 test = new Test1();
        new Thread(()->test.m()).start();

//        Thread.sleep(3000);
//        test.count=10;

        new Thread(()->test.m()).start();
        new Thread(()->test.m()).start();
    }


}

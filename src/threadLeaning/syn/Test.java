package threadLeaning.syn;

/**
 * @ClassName: Test
 * @author: csh
 * @date: 2019/11/8  11:09
 * @Description:  synchronized  锁定的是一个对象(堆内容 而不是引用  new 之后 锁就释放了)  而不是代码
 */
public class Test {

    private  int count = 10;

    public  void  m()
    {
        synchronized (this)
        {
            while (count>0)
            {
                count--;
                System.out.println(Thread.currentThread().getName()+" " +count);
            }
        }
    }

    //     等同于上面的代码
//    public synchronized  void  m(){
//
//    }

    public static void main(String[] args) throws InterruptedException {

        Test test = new Test();
        new Thread(()->test.m()).start();

//        Thread.sleep(3000);
//        test.count=10;

        new Thread(()->test.m()).start();
        new Thread(()->test.m()).start();
    }


}

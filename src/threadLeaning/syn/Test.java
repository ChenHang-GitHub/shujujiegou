package threadLeaning.syn;

import java.lang.reflect.Field;

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
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" " +count);
            }
        }
    }

    //
//    public synchronized  void  m(){
//
//    }

    public static void main(String[] args) throws InterruptedException, NoSuchFieldException, IllegalAccessException {

        Test test = new Test();
        new Thread(()->test.m()).start();

//        Thread.sleep(3000);
//        test.count=10;
        Class<Test> testClass = Test.class;
        Field count = testClass.getDeclaredField("count");
        count.setAccessible(true);

        new Thread(()->test.m()).start();
        Thread.sleep(3000);
        count.set(test,5);
        new Thread(()->test.m()).start();
    }


}

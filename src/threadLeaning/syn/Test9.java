package threadLeaning.syn;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: Test8
 * @author: csh
 * @date: 2019/11/8  15:35
 * @Description:
 */
public class Test9 {

   AtomicInteger atomicInteger = new AtomicInteger(0);   //效率比syn 高

    void m() {
        for (int i = 0; i < 10000; i++) {
         atomicInteger.incrementAndGet(); // ++ 操作
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Test9 test8 = new Test9();
        for (int i = 0; i < 5; i++) {
            new Thread(() -> test8.m(), "Thread" + i).start();
        }
        Thread.sleep(1000);
        System.out.println(test8.atomicInteger);

    }
}

package threadLeaning.syn;

/**
 * @ClassName: Test8
 * @author: csh
 * @date: 2019/11/8  15:35
 * @Description: *  volatile  保证线程之间变量的可见性
 * *  volatile  的效率 比 syn  高的多    但volatile 只保证了可见性   不保证原子性  syn 都保证
 */
public class Test8 {

    volatile int count;

   synchronized void m() {
        for (int i = 0; i < 10000; i++) {
            count++;   //++  不具备原子性
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Test8 test8 = new Test8();
        for (int i = 0; i < 5; i++) {
            new Thread(() -> test8.m(), "Thread" + i).start();
        }
        Thread.sleep(1000);
        System.out.println(test8.count);

    }
}

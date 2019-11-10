package threadLeaning.syn;

/**
 * @ClassName: Test2
 * @author: csh
 * @date: 2019/11/8  11:29
 * @Description:   理解有无synchronized 的输出
 */
public class Test2  implements  Runnable{

    private  int count =10;



    @Override
    public synchronized void run() {           //相当于synchronized（this）
        count--;
        System.out.println(Thread.currentThread().getName()+" "+count);
    }

    public static void main(String[] args) {

        Test2 test2 = new Test2();
        //线程执行方法的先后 是按cpu调度的  先生成的线程 不一定先执行方法
        for (int i = 0; i < 5; i++) {
            new Thread(test2,"Thread"+i).start();
        }
    }
}

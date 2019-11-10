package threadLeaning.syn;


/**
 * @ClassName: Test6
 * @author: csh
 * @date: 2019/11/8  14:42
 * @Description:
 *   出现异常  synchronized 的锁 默认被释放了  （如果不想释放锁就try/catch 处理异常）
 */
public class Test6 {

    private int count = 0;

    synchronized  void m (){
        while (true) {
            count++;
            System.out.println(Thread.currentThread().getName()+" "+count);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //模拟异常的情况
            if(count==5)
            {
                int i = 50/0;
            }
        }
    }
    public static void main(String[] args) {
        Test6 test6 = new Test6();
        new Thread(test6::m).start();
        new Thread(test6::m).start();
    }
}

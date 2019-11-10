package threadLeaning.syn;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: Test7
 * @author: csh
 * @date: 2019/11/8  14:57
 * @Description:
 *  volatile  保证线程之间变量的可见性
 *  volatile  的效率 比 syn  高的多    但volatile 只保证了可见性   不保证原子性
 */
public class Test7 {
   /*volatile*/ boolean running = true;

   void  m (){
       System.out.println("start");
       while (running){
           //死循环
       }
       System.out.println("end");
   }

    public static void main(String[] args) throws InterruptedException {
        Test7 test7 = new Test7();
        new Thread(test7::m).start();
        Thread.sleep(2000);
        test7.running=false;
    }

}

package threadLeaning.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: ReentrantLock
 * @author: csh
 * @date: 2019/11/8  20:40
 * @Description:     Lock lock = new ReentrantLock(); 使用时 必须要 手动 释放锁。
 *
 * 在遇到异常时不会像synchronizd自动释放锁 ，经常在finally 释放
 *
 * lock.tryLock(2,TimeUnit.SECONDS);  指定的时间无法锁定方法 或无法锁定方法 线程可以决定是否继续等待
 *
 * lock.lockInterruptibly();   //可以对interrupt方法做出响应
 *
 *  ReentrantLock可以指定为公平锁
 */
public class ReentrantLock2 {

    Lock lock = new ReentrantLock();   // m1,m2 用的同一把锁

    void m1 (){
        lock.lock();
        try {
            System.out.println("m1 睡很久");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();   //手动释放锁
        }
    }

    void  m2(){

        boolean locked = false;
        try {
//            lock.lockInterruptibly();   //可以对interrupt方法做出响应
            locked=lock.tryLock(2,TimeUnit.SECONDS);  //尝试去获取锁
            System.out.println(locked);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if(locked) lock.unlock();
        }

    }

    public static void main(String[] args) {
        ReentrantLock2 reentrantLock1 = new ReentrantLock2();
        new Thread(reentrantLock1::m1).start();
        new Thread(reentrantLock1::m2).start();  //t2
//        t2.interrupt();   // 响应这个方法

    }
}

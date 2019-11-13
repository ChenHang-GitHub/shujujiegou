package threadLeaning.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: ReentrantLock
 * @author: csh
 * @date: 2019/11/8  20:40
 * @Description:     Lock lock = new ReentrantLock(); 使用时 必须要 手动 释放锁。
 *
 *    在遇到异常时不会像synchronizd自动释放锁 ，经常在finally 释放
 */
public class ReentrantLock1 {

    Lock lock = new ReentrantLock();   //m1,m2 用的同一把锁

    void m1 (){
        lock.lock();
        try {
            Thread.sleep(3000);
            System.out.println("m1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();   //手动释放锁
        }
    }

    void  m2(){
        lock.lock();
        System.out.println("m2");
        lock.unlock();
    }

    public static void main(String[] args) {
        ReentrantLock1 reentrantLock1 = new ReentrantLock1();
        new Thread(reentrantLock1::m1).start();
        new Thread(reentrantLock1::m2).start();

    }
}

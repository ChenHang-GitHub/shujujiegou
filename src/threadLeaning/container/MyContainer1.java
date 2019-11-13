package threadLeaning.container;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MyContainer1
 * @author: csh
 * @date: 2019/11/8  19:46
 * @Description: 最优解决方法
 */
public class MyContainer1 {
    private volatile List<Object> list = new ArrayList<>();

    public void add(Object ele) {
        list.add(ele);
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {

        MyContainer1 container = new MyContainer1();
        // Count down 往下数  Latch 门闩
        // 门闩不能保证可见性，不是一种同步方式，只是一种线程通信方式，保证不了可见性
        // 门闩的等待，不会持有任何锁
        CountDownLatch latch = new CountDownLatch(1);

        new Thread(() -> {
            System.out.println("t2 启动");
            if (container.size() != 5) {
                try {
                    latch.await();
                    // 指定等待时间
                    //latch.await(5000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("监测到容器长度为5，线程2立即退出");
        }, "t2").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            System.out.println("t1 启动");
            for (int i = 0; i < 10; i++) {
                container.add(new Object());
                System.out.println("add " + i);
                // 当长度为5时，撤掉一个门闩，此时门闩为0，门会打开，即t2会执行
                if (container.size() == 5) {
                    latch.countDown();
                }
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t1").start();
    }

}


package threadLeaning.container;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MyContainer
 * @author: csh
 * @date: 2019/11/8  19:14
 * @Description: 写两个线程，线程1添加10个元素到容器中，线程2实现监控元素的个数，当个数到达5时，线程2给出提示并结束
 */
public class MyContainer {

    private volatile List<Object> list = new ArrayList<>();

    public void add(Object ele) {
        list.add(ele);
    }

    public int size() {
        return list.size();
    }


    public static void main(String[] args) {

        MyContainer myContainer = new MyContainer();

        new Thread(() -> {
            while (true) {
                if (myContainer.size() == 5) {
                    break;
                }
            }
            System.out.println("exit");
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                myContainer.add(new Object());
                System.out.println(i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}

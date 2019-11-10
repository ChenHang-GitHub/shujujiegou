package JAVA300.ThreadTest;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {
    public static void main(String[] args) throws InterruptedException {
//        CopyOnWriteArrayList<String> integers = new CopyOnWriteArrayList<>();
        ArrayList<String> integers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                integers.add(Thread.currentThread().getName());
            }).start();
        }
        Thread.sleep(2000);
        for (int i = 0; i < 1000; i++) {
            System.out.println(integers.get(i));
        }
//            System.out.println(integers.get(0));

    }
}

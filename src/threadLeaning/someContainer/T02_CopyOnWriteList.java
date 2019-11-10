package threadLeaning.someContainer;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName: T02_CopyOnWriteList
 * @author: csh
 * @date: 2019/11/10  15:36
 * @Description:
 *
 */
public class T02_CopyOnWriteList {


    public static void main(String[] args) {

        List<String> list =
                //new ArrayList<>();
//                new Vector<>();
        new CopyOnWriteArrayList<>();  // 写速极慢，读取快

        Random r = new Random();
        Thread[] ths = new Thread[100];

        for (int i = 0; i < ths.length; i++) {
            Runnable task = () -> {
                for (int j = 0; j < 1000; j++) {
                    list.add("a" + r.nextInt(100));
                }
            };
            ths[i] = new Thread(task);

        }
        runAndComputeTime(ths);
        System.out.println(list.size());

    }

    static void runAndComputeTime(Thread[] ths) {
        long start = System.currentTimeMillis();
        Arrays.asList(ths).forEach(Thread::start);
        Arrays.asList(ths).forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

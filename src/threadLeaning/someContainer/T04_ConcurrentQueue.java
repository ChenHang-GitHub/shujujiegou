package threadLeaning.someContainer;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @ClassName: T04_ConcurrentQueue
 * @author: csh
 * @date: 2019/11/10  16:27
 * @Description:
 */
public class T04_ConcurrentQueue {

    public static void main(String[] args) {
        Queue<String> queue = new ConcurrentLinkedQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.offer("a" + i);
        }
        System.out.println(queue);
        System.out.println("Size" + queue.size());

        System.out.println(queue.poll()); // 取出队头
        System.out.println(queue.size());

        System.out.println(queue.peek()); // 取出队头，但是不删除队头
        System.out.println(queue.size());


        //Deque
    }
}

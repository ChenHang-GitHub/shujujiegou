package threadLeaning.poll;

import java.util.concurrent.*;

/**
 * @ClassName: T06_Future
 * @author: csh
 * @date: 2019/11/11  14:08
 * @Description:
 */
public class T06_Future {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Integer> task = new FutureTask<>(()->{
            TimeUnit.SECONDS.sleep(1);
                return 100;
        });
        new Thread(task).start();

        System.out.println(task.get());   // 阻塞 等待任务执行完成, 获取到返回值

        System.out.println("---------------------------------------");
        ExecutorService service =  Executors.newFixedThreadPool(5);
        Future<Integer> submit = service.submit(() -> {
            TimeUnit.SECONDS.sleep(1);
            return 100;
        });

        System.out.println(submit.isDone());
        System.out.println(submit.get());  //get 完了后  isDone 才 True
        System.out.println(submit.isDone());


    }
}

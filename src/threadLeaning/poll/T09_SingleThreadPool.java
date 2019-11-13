package threadLeaning.poll;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: T09_SingleThreadPool
 * @author: csh
 * @date: 2019/11/11  16:06
 * @Description:
 */
public class T09_SingleThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            final  int j = i ; //Error:(18, 53) java: 从lambda 表达式引用的本地变量必须是最终变量或实际上的最终变量
            service.execute(()-> System.out.println(j+" "+Thread.currentThread().getName()));
            
        }
    }
}

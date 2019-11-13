package threadLeaning.poll;

import java.util.concurrent.Executor;

/**
 * @ClassName: T01_MyExecutor
 * @author: csh
 * @date: 2019/11/11  10:18
 * @Description:
 */
public class T01_MyExecutor implements Executor {


    @Override
    public void execute(Runnable command) {
        //作用, Executor 可以传入一个Runnable接口, runnable接口用于定义一项任务, 将任务传递给Executor后, 由 Executor.execute() 方法定义如何执行任务
        command.run();
    }
}

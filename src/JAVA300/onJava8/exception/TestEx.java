package JAVA300.onJava8.exception;

import com.sun.org.apache.bcel.internal.util.ClassPath;

/**
 * @ClassName: TestEx
 * @author: csh
 * @date: 2019/11/4  14:12
 * @Description:
 */

//自定义的异常
class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

public class TestEx {

    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException("msg");
    }

    public static void main(String[] args) {

//        int i = 5 / 0;  //RuntimeException 和其子类  由jvm 自动抛出
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
        }

        System.out.println("继续执行？");
    }
}

package JAVA300.onJava8.interfaceTest.statciTest;

/**
 * @ClassName: Machine
 * @author: csh
 * @date: 2019/11/1  16:12
 * @Description:
 */


class Bing implements Operations {
    @Override
    public void execute() {
        //静态变量 和方法 都可以 在实现类中调用   , 但是静态方法 不象默认方法可以被重写
        Operations.show("Bing");
    }
}

class Crack implements Operations {
    @Override
    public void execute() {
        Operations.show("Crack");
    }
}

class Twist implements Operations {
    @Override
    public void execute() {
        Operations.show("Twist");
    }

}



public class Machine {
    public static void main(String[] args) {
        //通过接口名.方法名 调用接口的静态方法  传入可变参数列表
          Operations.runOps(new Bing(),new Crack());
          Operations.show("Operations.show");
    }
}

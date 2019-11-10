package JAVA300.onJava8.interfaceTest.statciTest;

/**
 * @ClassName: Operations
 * @author: csh
 * @date: 2019/11/1  16:06
 * @Description: Java 8 允许在接口中添加静态方法。这么做能恰当地把工具功能置于接口中，从而操作接口，或者成为通用的工具：
 */
public interface Operations {

    void execute();

    /**
     *
     * @param ops  可变参数列表 因而我们可以传入 任意多 的 Operation 参数并 按顺序 运行它们：
     */
    static void runOps(Operations... ops) {
        for (Operations op:ops
             ) {
            op.execute();
        }
    }

    public  static void show (String msg){
        System.out.println(msg);
    }

    //[3] 可以在接口中定义 main() 方法。
    public static void main(String[] args) {

    }

}

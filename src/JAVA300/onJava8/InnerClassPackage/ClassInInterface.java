package JAVA300.onJava8.InnerClassPackage;

/**
 * @ClassName: ClassInInterface
 * @author: csh
 * @date: 2019/11/14  20:39
 * @Description:    嵌套类可以作为接口的一部分。你放到接口中的任何类都自动地是 public 和 static 的。
 */

//如果你想要创建某些公共代码，使得它们可以被某个接口的所有不同实现所共用，那么使用接口内部的嵌套类会显得很方便。
public interface ClassInInterface {
    void  howdy();
    public  static class Test implements  ClassInInterface{

        @Override
        public void howdy() {
            System.out.println("接口中的嵌套类");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }

}

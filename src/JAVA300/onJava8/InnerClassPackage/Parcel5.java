package JAVA300.onJava8.InnerClassPackage;

import JAVA300.onJava8.InnerClassPackage.inf.Destination;

/**
 * @ClassName: Parcel5
 * @author: csh
 * @date: 2019/11/14  19:43
 * @Description: PDestination 类是 destination() 方法的一部分，而不是 Parcel5 的一部分。
 * 所以，在 destination() 之外不能访问 PDestination，注意出现在 return 语句中的向上转型-返回的是 Destination 的引用，它是 PDestination 的基类
 * 。当然，在 destination() 中定义了内部类 PDestination，并不意味着一旦 dest() 方法执行完毕，PDestination 就不可用了。
 */


//展示了在方法的作用域内（而不是在其他类的作用域内）创建一个完整的类。这被称作局部内部类：
public class Parcel5 {
    public Destination destination(String s) {
        final class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }

}

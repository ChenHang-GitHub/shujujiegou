package JAVA300.onJava8.InnerClassPackage;

/**
 * @ClassName: DotThis
 * @author: csh
 * @date: 2019/11/13  15:29
 * @Description: 如果你需要生成对外部类对象的引用，可以使用外部类的名字后面紧跟圆点和 this。
 * 这样产生的引用自动地具有正确的类型，这一点在编译期就被知晓并受到检查，因此没有任何运行时开销。
 * 下面的示例展示了如何使用 .this：
 */
public class DotThis {

    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
            // A plain "this" would be Inner's "this"

        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner inner = dt.inner();
        // 内部类创建外部类的实例
        inner.outer().f();


    }
}

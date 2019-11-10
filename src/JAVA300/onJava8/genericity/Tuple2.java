package JAVA300.onJava8.genericity;

/**
 * @ClassName: Tuple2
 * @author: csh
 * @date: 2019/11/5  16:07
 * @Description:
 * 通常，元组可以具有任意长度，元组中的对象可以是不同类型的。
 * 不过，我们希望能够为每个对象指明其类型，并且从元组中读取出来时，能够得到正确的类型。
 * 要处理不同长度的问题，我们需要创建多个不同的元组。下面是一个可以存储两个对象的元组：
 *
 *
 *
 * 初次阅读上面的代码时，你可能认为这违反了 Java 编程的 封装原则。a1 和 a2 应该声明为 private，然后提供 getFirst() 和 getSecond() 取值方法才对呀？
 * 考虑下这样做能提供的“安全性”是什么：元组的使用程序可以读取 a1 和 a2 然后对它们执行任何操作，但无法对 a1 和 a2 重新赋值。
 */
public class Tuple2<A,B> {
    public  final  A  a1 ;
    public  final  B  a2 ;

    public Tuple2(A a1, B a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
    public String toString() {
        return "Tuple2{" +
                "a1=" + a1 +
                ", a2=" + a2 +
                '}';
    }
}

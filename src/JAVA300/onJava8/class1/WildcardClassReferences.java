package JAVA300.onJava8.class1;

/**
 * @ClassName: WildcardClassReferences
 * @author: csh
 * @date: 2019/11/5  13:49
 * @Description:   为了在使用 Class 引用时放松限制，我们使用了通配符，它是 Java 泛型中的一部分。通配符就是 ?，表示“任何事物”。
 */
public class WildcardClassReferences {

    public static void main(String[] args) {
        //使用 Class<?> 比单纯使用 Class 要好，虽然它们是等价的，并且单纯使用 Class 不会产生编译器警告信息。
        // 使用 Class<?> 的好处是它表示你并非是碰巧或者由于疏忽才使用了一个非具体的类引用，而是特意为之。
        Class<?> initClass = int.class;
        initClass = double.class;



        //为了创建一个限定指向某种类型或其子类的 Class 引用，我们需要将通配符与 extends 关键字配合使用，创建一个范围限定。这与仅仅声明 Class<Number> 不同

        Class<?extends Number> bounded =  int.class;
        bounded =  double.class;
        // Or anything else derived from Number.
        //向 Class 引用添加泛型语法的原因只是为了提供编译期类型检查，因此如果你操作有误，稍后就会发现这点。
        // 使用普通的 Class 引用你要确保自己不会犯错，因为一旦你犯了错误，就要等到运行时你才能发现它，这并不是很方便。



    }
}

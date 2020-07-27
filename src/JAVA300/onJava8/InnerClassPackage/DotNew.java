package JAVA300.onJava8.InnerClassPackage;

/**
 * @ClassName: DotNew
 * @author: csh
 * @date: 2019/11/13  15:38
 * @Description:
 */
public class DotNew {
    public  class  Inner{}

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        DotNew.Inner inner = dotNew.new Inner();
        //想直接创建内部类的对象，你不能按照你想象的方式
        //去引用外部类的名字 DotNew，而是必须使用外部类的对象来创建该内部类对象，就像在上面的程序中所看到的那样。
        // 这也解决了内部类名字作用域的问题，因此你不必声明（实际上你不能声明）
    }
}

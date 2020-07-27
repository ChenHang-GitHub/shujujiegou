package JAVA300.onJava8.interfaceTest.defaultTest;

/**
 * @ClassName: InterfaceWithDefault
 * @author: csh
 * @date: 2019/11/1  15:52
 * @Description:
 */
public interface InterfaceWithDefault {

    public static final int i = 0;
    public abstract  void firstMethod();

    public abstract void secondMethod();

    //增加默认方法的极具说服力的理由是它允许在不破坏已使用接口的代码的情况下，在接口中增加新的方法。
    // 默认方法有时也被称为守卫方法或虚拟扩展方法。
    default void  deafultMethod(){
        System.out.println("实现接口的对象 ：可以调用默认方法，但不用实现他");
    }
}

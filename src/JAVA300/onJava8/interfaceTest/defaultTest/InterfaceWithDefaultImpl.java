package JAVA300.onJava8.interfaceTest.defaultTest;

/**
 * @ClassName: InterfaceWithDefaultImpl
 * @author: csh
 * @date: 2019/11/1  15:53
 * @Description:
 */
public class InterfaceWithDefaultImpl implements InterfaceWithDefault {
    @Override
    public void firstMethod() {

    }

    @Override
    public void secondMethod() {

    }

    @Override
    public void deafultMethod() {
        System.out.println("如果重写 则不调用接口中的默认方法" + i);
    }
}


class  TestInterface{
    public static void main(String[] args) {
        InterfaceWithDefault interfaceWithDefault = new InterfaceWithDefaultImpl();
        interfaceWithDefault.deafultMethod();
    }
}
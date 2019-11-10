package JAVA300.onJava8.genericity;

/**
 * @ClassName: GenericHolder
 * @author: csh
 * @date: 2019/11/5  15:52
 * @Description: 获取想要的对象的泛型方式
 */


class Automobile {
}

public class GenericHolder<T> {
    private T a;

    public GenericHolder() {
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        GenericHolder<Automobile> automobileGenericHolder = new GenericHolder<>();
        automobileGenericHolder.setA(new Automobile());
        Automobile a = automobileGenericHolder.getA();

    }
}

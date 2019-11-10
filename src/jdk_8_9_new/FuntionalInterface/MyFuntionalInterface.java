package jdk_8_9_new.FuntionalInterface;
/*
* 函数式接口:有且只有一个‘抽象’方法的接口叫做函数式接口 (可以有其他默认，静态，私有的方法)
* @FunctionalInterface  检测接口是否为函数式接口
* */
@FunctionalInterface
public interface MyFuntionalInterface {
    //public abstract 可以省略
    public  abstract  void method();
}

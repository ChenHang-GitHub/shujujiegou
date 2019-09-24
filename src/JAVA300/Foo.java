package JAVA300;

/*
* 同一个类中的多个方法可以有相同的方法名称，但是有不同的参数列表，这就称为方法重载（method overloading）。
*
*
* 方法名称必须相同。
参数列表必须不同。
方法的返回类型可以相同也可以不相同。
仅仅返回类型不同不足以称为方法的重载。
* */
public class Foo {
    public  void method(String str ,int ages){}
    public  int method(String str ){return 1;}
    public  int method(int ages){return 1;}


}

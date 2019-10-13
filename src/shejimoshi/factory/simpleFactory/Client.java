package shejimoshi.factory.simpleFactory;
/*
* 简单工厂的定义：提供一个创建对象实例的功能，而无须关心其具体实现。被创建实例的类型可以是接口、抽象类，也可以是具体的类
* 根据简单工厂的定义，用户只要产品而不在乎产品如何生产，看起来好像很完美的样子。但大家想想，这个世界存在什么都生产的工厂吗？
显然是不存在的，每一个汽车品牌都有自己的生产工厂，都有自己生产技术。
映射到spring框架中，我们有很多很多种的bean需要生产，如果只依靠一个简单工厂来实现，那么我们得在工厂类中嵌套多少个if..else if？
* */
public class Client {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Car car = simpleFactory.getCar("BMW");
        System.out.println(car.getName());

    }
}

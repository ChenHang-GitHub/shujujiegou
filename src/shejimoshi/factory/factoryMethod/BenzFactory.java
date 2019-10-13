package shejimoshi.factory.factoryMethod;

public class BenzFactory  implements  Factory{
    @Override
    public Car getCar() {
        return new Benz();
    }
}

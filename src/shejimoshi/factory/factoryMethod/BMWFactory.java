package shejimoshi.factory.factoryMethod;

public class BMWFactory implements  Factory {
    @Override
    public Car getCar() {
        return new BMW();
    }
}

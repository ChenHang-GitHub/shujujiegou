package shejimoshi.factory.abstractFactory;

public class NorthFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new NorthApple();
    }
}

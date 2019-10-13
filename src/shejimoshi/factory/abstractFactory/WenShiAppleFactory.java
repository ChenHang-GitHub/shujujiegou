package shejimoshi.factory.abstractFactory;

public class WenShiAppleFactory implements  FruitFactory {
    @Override
    public Fruit getApple() {
        return new WenShiApple();
    }
}

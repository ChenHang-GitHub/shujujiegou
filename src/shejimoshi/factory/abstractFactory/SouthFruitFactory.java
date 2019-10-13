package shejimoshi.factory.abstractFactory;

public class SouthFruitFactory implements  FruitFactory {
    @Override
    public Fruit getApple() {
        return new SouthApple();
    }
}

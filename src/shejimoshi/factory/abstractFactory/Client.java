package shejimoshi.factory.abstractFactory;

public class Client {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new NorthFruitFactory();
        Fruit apple = fruitFactory.getApple();
        apple.get();
    }
}

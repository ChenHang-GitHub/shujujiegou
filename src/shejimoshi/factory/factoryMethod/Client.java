package shejimoshi.factory.factoryMethod;

public class Client {
    public static void main(String[] args) {
        //需要BMW
        BMWFactory bmwFactory = new BMWFactory();
        System.out.println(bmwFactory.getCar().getName());
    }
}

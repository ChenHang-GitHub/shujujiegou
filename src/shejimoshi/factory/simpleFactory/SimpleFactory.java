package shejimoshi.factory.simpleFactory;

//简单工厂，既能生产宝马又能生产奔驰
public class SimpleFactory {

    public Car getCar(String name) {
        if (name.equals("BMW")) {
            return new BMW();
        } else if (name.equals("Benz")) {
            return new Benz();
        } else {
            System.out.println("无法生产：" + name);
            return null;
        }
    }

}

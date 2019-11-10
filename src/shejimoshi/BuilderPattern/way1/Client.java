package shejimoshi.BuilderPattern.way1;

/**
 * @ClassName: Client
 * @author: csh
 * @date: 2019/11/3  16:27
 * @Description:    测试类（客户）
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        //要获得product对象 调用指挥者的方法 传入具体创建对象的方法 （工人）
        Product product = director.create(new ConcreteBuilder());
        System.out.println(product);
    }
}

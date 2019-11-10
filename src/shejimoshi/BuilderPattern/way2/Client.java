package shejimoshi.BuilderPattern.way2;



/**
 * @ClassName: Client
 * @author: csh
 * @date: 2019/11/3  16:27
 * @Description:    测试类（客户）
 */
public class Client {
    public static void main(String[] args) {
        Product build = new ConcreteBuilder()
                .bulidA("1")
                .bulidB("2")
                .build();
        System.out.println(build.toString());

    }
}

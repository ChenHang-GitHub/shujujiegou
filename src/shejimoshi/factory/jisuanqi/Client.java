package shejimoshi.factory.jisuanqi;

public class Client {
    public static void main(String[] args) {
//简单工厂模式  实现计算器
        int num1 = 1;
        int num2 = 1;
        Operation operation = new OperationFactory().getOperation("+");
        int result = operation.getResult(num1, num2);
        System.out.println(result);
    }
}

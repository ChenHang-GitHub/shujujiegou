package shejimoshi.factory.jisuanqi;

public class AddOperation implements  Operation {
    @Override
    public int getResult(int num1, int num2) {
        return num1+num2;
    }
}

package shejimoshi.factory.jisuanqi;

public class OperationFactory   {
    public Operation getOperation(String oper) {
        if(oper.equals("+"))
        {
            return new AddOperation();
        }
        return null;
    }
}

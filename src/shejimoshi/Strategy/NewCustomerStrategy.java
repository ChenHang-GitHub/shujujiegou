package shejimoshi.Strategy;

import java.math.BigDecimal;

public class NewCustomerStrategy  implements  IQuoteStrategy{
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("新客户 没有折扣");
        return originalPrice;
    }
}

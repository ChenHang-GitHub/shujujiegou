package shejimoshi.Strategy;

import java.math.BigDecimal;

public class OldCustomerStrategy implements  IQuoteStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("老客户 9 折");
        originalPrice=originalPrice.multiply(new BigDecimal(0.9).setScale(2,BigDecimal.ROUND_HALF_UP));
        return originalPrice;
    }
}

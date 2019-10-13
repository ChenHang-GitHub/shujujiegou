package shejimoshi.Strategy;

import java.math.BigDecimal;

//报价 上下文
public class QuoteContext  {
    private  IQuoteStrategy iQuoteStrategy;

    public QuoteContext(IQuoteStrategy iQuoteStrategy) {
        this.iQuoteStrategy = iQuoteStrategy;
    }

    public BigDecimal getPrice(BigDecimal originalPrice){
         return  iQuoteStrategy.getPrice(originalPrice);
    }
}

package shejimoshi.Strategy;

import java.math.BigDecimal;

public interface IQuoteStrategy {
    BigDecimal getPrice (BigDecimal originalPrice);
}

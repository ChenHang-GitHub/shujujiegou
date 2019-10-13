package shejimoshi.Strategy;

import java.math.BigDecimal;
/*
* 这个很容易，只要新增一个报价策略的实现，然后外部客户端调用的时候，创建这个新增的报价策略实现，并设置到策略上下文就可以了，对原来已经实现的代码没有任何的改动。*/
public class Client {
    public static void main(String[] args) {
        NewCustomerStrategy newCustomerStrategy = new NewCustomerStrategy();
        QuoteContext quoteContext = new QuoteContext(newCustomerStrategy);
        BigDecimal price = quoteContext.getPrice(new BigDecimal(100));
        System.out.println(price);
    }
}

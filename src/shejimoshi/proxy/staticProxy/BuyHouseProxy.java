package shejimoshi.proxy.staticProxy;

import shejimoshi.proxy.JdkDynamicProxy.BuyHouse;

public class BuyHouseProxy implements BuyHouse {


    private    BuyHouse buyHouse;

    public  BuyHouseProxy(final BuyHouse buyHouse)
    {
        this.buyHouse=buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("买房前---");
        buyHouse.buyHouse();
        System.out.println("买房后---");

    }
}

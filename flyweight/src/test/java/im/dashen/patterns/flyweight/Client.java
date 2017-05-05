package im.dashen.patterns.flyweight;

import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void sellTea() throws Exception {
        TeaMaker maker = new TeaMaker();
        TeaShop shop = new TeaShop(maker);
        shop.takeOrder("less sugar");
        shop.takeOrder("more milk");
        shop.takeOrder("without sugar");
        shop.serve();
    }
}
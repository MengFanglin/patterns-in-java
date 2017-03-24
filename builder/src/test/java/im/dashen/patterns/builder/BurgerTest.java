package im.dashen.patterns.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class BurgerTest {

    @Test
    public void createBurger() throws Exception {
        Burger burger = new BurgerBuilder(12)
                .setTomato("tomato")
                .setPepperoni("pepperoni")
                .setLettuce("lettuce")
                .setCheese("cheese")
                .build();
        System.out.println(burger);
    }
}
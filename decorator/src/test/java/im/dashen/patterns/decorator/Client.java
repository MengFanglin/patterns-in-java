package im.dashen.patterns.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void testCalcCoffeeCost() throws Exception {
        Coffee someCoffee = new SimpleCoffee();
        System.out.println(someCoffee.getCost());
        System.out.println(someCoffee.getDescription());


        Coffee milkCoffee = new MilkCoffee(someCoffee);
        System.out.println(milkCoffee.getCost());
        System.out.println(milkCoffee.getDescription());

        Coffee whipCoffee = new WhipCoffee(milkCoffee);
        System.out.println(whipCoffee.getCost());
        System.out.println(whipCoffee.getDescription());

        Coffee vanillaCoffee = new VanillaCoffe(whipCoffee);
        System.out.println(vanillaCoffee.getCost());
        System.out.println(vanillaCoffee.getDescription());
    }
}
package food.impl;

import food.Burger;

/**
 * @Author: DashShen
 * @Date: 16-11-4
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Vegetable burger";
    }

    @Override
    public Float price() {
        return 5.0f;
    }
}

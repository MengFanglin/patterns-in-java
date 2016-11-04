package food.impl;

import food.Burger;

/**
 * @Author: DashShen
 * @Date: 16-11-4
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public Float price() {
        return 10.0f;
    }
}

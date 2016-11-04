package food.impl;

import food.Drink;

/**
 * @Author: DashShen
 * @Date: 16-11-4
 */
public class ColdDrink extends Drink {
    @Override
    public String name() {
        return "Cold drink";
    }

    @Override
    public Float price() {
        return 3.0f;
    }
}

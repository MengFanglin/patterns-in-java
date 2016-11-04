package food.impl;

import food.Drink;

/**
 * @Author: DashShen
 * @Date: 16-11-4
 */
public class HotDrink extends Drink {
    @Override
    public String name() {
        return "Hot drink";
    }

    @Override
    public Float price() {
        return 4.0f;
    }
}

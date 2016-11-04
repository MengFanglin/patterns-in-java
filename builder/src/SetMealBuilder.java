import food.impl.ChickenBurger;
import food.impl.ColdDrink;
import food.impl.HotDrink;
import food.impl.VegBurger;

/**
 * @Author: DashShen
 * @Date: 16-11-4
 */
public class SetMealBuilder {
    public SetMeal prepareVegSetMeal() {
        SetMeal meal = new SetMeal();
        meal.addItem(new VegBurger());
        meal.addItem(new HotDrink());
        return meal;

    }

    public SetMeal prepareNoVegSetMeal() {
        SetMeal meal = new SetMeal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new ColdDrink());
        return meal;
    }
}

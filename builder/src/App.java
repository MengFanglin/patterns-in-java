/**
 * @Author: DashShen
 * @Date: 16-11-4
 */
public class App {
    public static void main(String args[]) {
        SetMealBuilder builder = new SetMealBuilder();
        SetMeal vegMeal = builder.prepareVegSetMeal();
        System.out.println("Vegetable set meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost() + "\n");

        SetMeal noVegMeal = builder.prepareNoVegSetMeal();
        System.out.println("No vegetable set meal");
        noVegMeal.showItems();
        System.out.println("Total Cost: " + noVegMeal.getCost());


    }

}

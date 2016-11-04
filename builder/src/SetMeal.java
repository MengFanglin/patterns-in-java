import food.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: DashShen
 * @Date: 16-11-4
 */
public class SetMeal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Float getCost() {
        Float totalCost = 0.0f;
        for (Item item : items) {
            totalCost += item.price();
        }
        return totalCost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.name());
            System.out.println("Pack: " + item.pack().packing());
            System.out.println("Price: " + item.price());
        }
    }

}

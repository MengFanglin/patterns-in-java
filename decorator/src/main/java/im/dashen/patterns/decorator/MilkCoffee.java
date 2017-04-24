package im.dashen.patterns.decorator;

public class MilkCoffee implements Coffee {
    private Coffee coffee;

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public Double getCost() {
        return coffee.getCost() + 2.2;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ",milk";
    }
}

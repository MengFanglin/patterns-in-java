package im.dashen.patterns.decorator;

public class WhipCoffee implements Coffee {
    private Coffee coffee;

    public WhipCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public Double getCost() {
        return coffee.getCost() + 1.0;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ",whip";
    }
}

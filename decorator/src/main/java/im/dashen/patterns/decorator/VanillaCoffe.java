package im.dashen.patterns.decorator;

public class VanillaCoffe implements Coffee {
    private Coffee coffee;

    public VanillaCoffe(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public Double getCost() {
        return coffee.getCost()+3.1;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+",vanilla";
    }
}

package im.dashen.patterns.decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public Double getCost() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "Simple coffee";
    }
}

package im.dashen.patterns.simplefactory;

public class WoodenDoor implements Door {
    private Double width;
    private Double length;

    public WoodenDoor(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public Double getWidth() {
        return this.width;
    }

    @Override
    public Double getLength() {
        return this.length;
    }
}

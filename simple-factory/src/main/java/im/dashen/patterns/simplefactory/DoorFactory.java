package im.dashen.patterns.simplefactory;

public class DoorFactory {

    public static Door makeDoor(Double width, Double length) {
        return new WoodenDoor(width, length);
    }
}

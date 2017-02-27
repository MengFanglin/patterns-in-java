package im.dashen.patterns.simplefactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void UseDoorFactory() throws Exception {
        Door door = DoorFactory.makeDoor(100.0, 200.0);
        System.out.println("Width: " + door.getWidth());
        System.out.println("Length: " + door.getLength());
    }
}
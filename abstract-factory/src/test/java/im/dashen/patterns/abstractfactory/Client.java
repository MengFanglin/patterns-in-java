package im.dashen.patterns.abstractfactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void makeDoor() throws Exception {
        DoorFactory woodenDoorFactory = new WoodenDoorFactory();
        Door woodenDoor = woodenDoorFactory.makeDoor();
        DoorFittingExpert carpenter = woodenDoorFactory.makeFittingExpert();
        System.out.println(carpenter.getDescription());
        System.out.println(woodenDoor.getDescription());


        DoorFactory ironDoorFactory = new IronDoorFactory();
        Door ironDoor = ironDoorFactory.makeDoor();
        DoorFittingExpert welder = ironDoorFactory.makeFittingExpert();
        System.out.println(welder.getDescription());
        System.out.println(ironDoor.getDescription());
    }
}
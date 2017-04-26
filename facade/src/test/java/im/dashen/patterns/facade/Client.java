package im.dashen.patterns.facade;

import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void testUseComputerFacade() throws Exception {
        ComputerFacade facade = new ComputerFacade(new Computer());
        facade.turnOn();
        facade.turnOff();
    }

}
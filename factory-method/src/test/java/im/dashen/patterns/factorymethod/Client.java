package im.dashen.patterns.factorymethod;

import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void interview() throws Exception {
        HiringManager devManager = new DevelopmentHiringManager();
        devManager.takeInterview();

        HiringManager marketingManager = new MarktingManager();
        marketingManager.takeInterview();
    }
}
package im.dashen.patterns.adapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void hunterHuntWildDog() throws Exception {
        Lion asiaLion = new AsiaLion();
        Lion africanLion = new AfricanLion();

        WildDog wildDog = new AfricanWildDog();
        WildDogAdapter wildDogAdapter = new WildDogAdapter(wildDog);

        Hunter hunter = new Hunter();
        hunter.hunt(asiaLion);
        hunter.hunt(africanLion);

        // hunter can also hunt wild dog
        hunter.hunt(wildDogAdapter);
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void cloneSheep() throws Exception {
        Sheep jolly = new Sheep("jolly", "origin");
        System.out.println("Name: " + jolly.getName());
        System.out.println("Category: " + jolly.getCategory());

        Sheep dolly = (Sheep) jolly.clone();
        dolly.setName("dolly");
        System.out.println("Name: " + dolly.getName());
        System.out.println("Category: " + dolly.getCategory());
    }
}
package im.dashen.patterns.singleton;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Client {

    @Test
    public void getPresident() throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Runnable task = () -> {
            President president = President.getPresident();
            System.out.println(president.hashCode());
        };
        for (int i = 0; i < 5; ++i) {
            service.execute(task);
        }
        service.shutdown();
    }
}
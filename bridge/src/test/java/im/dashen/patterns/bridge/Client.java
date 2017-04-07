package im.dashen.patterns.bridge;

import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void runWebPage() throws Exception {
        Theme darkTheme = new DarkTheme();
        Theme aquaTheme = new AquaTheme();

        WebPage about = new About(darkTheme);
        WebPage careers = new Careers(aquaTheme);

        System.out.println(about.getContent());
        System.out.println(careers.getContent());
    }
}
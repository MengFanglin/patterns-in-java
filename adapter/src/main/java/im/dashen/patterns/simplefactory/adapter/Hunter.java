package im.dashen.patterns.simplefactory.adapter;

public class Hunter {
    public void hunt(Lion lion) {
        System.out.println("Hunter hunted " + lion.roar());
    }
}

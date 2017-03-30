package im.dashen.patterns.singleton;

public class President {
    private static President president;

    public static President getPresident() {
        if (president == null) {
            synchronized (President.class) {
                if (president == null) {
                    president = new President();
                }
            }
        }
        return president;
    }

    private President() {
    }
}

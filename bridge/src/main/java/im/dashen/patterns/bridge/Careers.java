package im.dashen.patterns.bridge;

public class Careers implements WebPage {
    private Theme theme;

    public Careers(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "Careers page with " + theme.getColor() + " color";
    }
}

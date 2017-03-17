package im.dashen.patterns.adapter;

public class WildDogAdapter implements Lion {
    private WildDog wildDog;

    public WildDogAdapter(WildDog wildDog) {
        this.wildDog = wildDog;
    }

    @Override
    public String roar() {
        return wildDog.bark();
    }
}

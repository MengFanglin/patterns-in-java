package im.dashen.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeaMaker {

    private Map<String, Tea> availableTeas = new HashMap<>();

    public Tea make(String teaType) {
        availableTeas.computeIfAbsent(teaType, k -> new Tea());
        return availableTeas.get(teaType);
    }
}

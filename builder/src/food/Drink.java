package food;

import pack.Packing;
import pack.impl.Bottle;

/**
 * @Author: DashShen
 * @Date: 16-11-4
 */
public abstract class Drink implements Item {
    @Override
    public Packing pack() {
        return new Bottle();
    }
}

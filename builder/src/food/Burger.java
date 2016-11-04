package food;

import pack.Packing;
import pack.impl.Wrapper;

/**
 * @Author: DashShen
 * @Date: 16-11-4
 */
public abstract class Burger implements Item {
    @Override
    public Packing pack() {
        return new Wrapper();
    }
}

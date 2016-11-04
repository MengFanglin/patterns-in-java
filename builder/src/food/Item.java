package food;

import pack.Packing;

/**
 * @Author: DashShen
 * @Date: 16-11-4
 */
public interface Item {
    String name();

    Packing pack();

    Float price();
}


import color.Color;
import shape.Shape;

/**
 * @Author: DashShen
 * @Date: 16-11-3
 */
public abstract class AbstractFactory {
    abstract Color getColor(Class cls);

    abstract Shape getShape(Class cls);
}

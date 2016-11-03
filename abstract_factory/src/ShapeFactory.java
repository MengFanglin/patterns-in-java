import color.Color;
import shape.Shape;

/**
 * @Author: DashShen
 * @Date: 16-11-3
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(Class cls) {
        return null;
    }

    @Override
    Shape getShape(Class cls) {
        Shape shape = null;
        try {
            shape = (Shape) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return shape;
    }
}

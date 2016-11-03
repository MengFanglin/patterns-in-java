import color.Color;
import shape.Shape;

/**
 * @Author: DashShen
 * @Date: 16-11-3
 */
public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(Class cls) {
        Color color = null;
        try {
            color = (Color) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return color;
    }

    @Override
    Shape getShape(Class cls) {
        return null;
    }
}

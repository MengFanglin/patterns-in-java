/**
 * @Author: DashShen
 * @Date: 16-11-3
 */
public class ShapeFactory {

    public Shape getShape(Class cls) {
        Shape shape = null;
        try {
            shape = (Shape) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return shape;
    }
}

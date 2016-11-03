/**
 * @Author: DashShen
 * @Date: 16-11-3
 */
public class App {
    public static void main(String args[]) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape(Circle.class);
        circle.draw();

        Shape square = factory.getShape(Square.class);
        square.draw();

        Shape rectangle = factory.getShape(Rectangle.class);
        rectangle.draw();
    }
}

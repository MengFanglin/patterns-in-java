import color.Color;
import color.impl.Blue;
import color.impl.Green;
import color.impl.Red;
import shape.Shape;
import shape.impl.Circle;
import shape.impl.Rectangle;
import shape.impl.Square;

/**
 * @Author: DashShen
 * @Date: 16-11-3
 */
public class App {
    public static void main(String args[]) {
        AbstractFactory shapeFactory = FactoryProducer.produceFactory(ShapeFactory.class);
        AbstractFactory colorFactory = FactoryProducer.produceFactory(ColorFactory.class);

        // Draw shapes
        Shape rectangle = shapeFactory.getShape(Rectangle.class);
        rectangle.draw();

        Shape circle = shapeFactory.getShape(Circle.class);
        circle.draw();

        Shape square = shapeFactory.getShape(Square.class);
        square.draw();

        // Fill color
        Color red = colorFactory.getColor(Red.class);
        red.fill();

        Color green = colorFactory.getColor(Green.class);
        green.fill();

        Color blue = colorFactory.getColor(Blue.class);
        blue.fill();

    }
}

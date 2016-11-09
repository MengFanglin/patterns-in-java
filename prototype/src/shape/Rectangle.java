package shape;

/**
 * @Author: DashShen
 * @Date: 16-11-9
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Draw a rectangle");
    }
}

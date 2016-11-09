package shape;

/**
 * @Author: DashShen
 * @Date: 16-11-9
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }
}

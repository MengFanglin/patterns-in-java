package shape;

/**
 * @Author: DashShen
 * @Date: 16-11-9
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Draw a square");
    }
}

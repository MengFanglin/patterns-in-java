import shape.Shape;

/**
 * @Author: DashShen
 * @Date: 16-11-9
 */
public class App {
    public static void main(String args[]) {
        ShapeCache.loadShapes();

        Shape clonedType1 = ShapeCache.getShape("1");
        System.out.println("Type1: "+ clonedType1.getType());

        Shape clonedType2 = ShapeCache.getShape("2");
        System.out.println("Type2: "+ clonedType2.getType());

        Shape clonedType3 = ShapeCache.getShape("3");
        System.out.println("Type3: "+ clonedType3.getType());

    }
}

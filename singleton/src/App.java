/**
 * @Author: DashShen
 * @Date: 16-11-3
 */
public class App {
    public static void main(String args[]) {
        System.out.println("Create first object");
        SingleObject singleObjOne = SingleObject.getInstance();
        System.out.println("Address of first object is "+singleObjOne.hashCode());

        System.out.println("Create second object");
        SingleObject singleObjectTwo = SingleObject.getInstance();
        System.out.println("Address of second object is "+ singleObjectTwo.hashCode());
    }
}

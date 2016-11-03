/**
 * @Author: DashShen
 * @Date: 16-11-3
 */
public class SingleObject {
    private static SingleObject ourInstance = new SingleObject();

    public static SingleObject getInstance() {
        return ourInstance;
    }

    private SingleObject() {
    }
}

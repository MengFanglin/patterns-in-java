/**
 * @Author: DashShen
 * @Date: 16-11-3
 */
public class FactoryProducer {
    public static AbstractFactory produceFactory(Class cls) {
        AbstractFactory factory = null;
        try {
            factory = (AbstractFactory) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
}

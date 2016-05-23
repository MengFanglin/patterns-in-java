public class App {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        DecoratorA da = new DecoratorA();
        DecoratorB db = new DecoratorB();

        da.setComponent(concreteComponent);
        db.setComponent(da);
        db.operation();
    }
}

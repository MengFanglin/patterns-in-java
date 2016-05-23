public class DecoratorB extends AbstractDecorator {
    @Override
    public void operation() {
        super.operation();
        System.out.println("具体装饰对象B的操作");
    }
}

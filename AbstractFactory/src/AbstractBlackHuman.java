public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人是黑皮肤的");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话听不懂");
    }
}

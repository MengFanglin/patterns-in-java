public class MulFactory implements Factory {
    @Override
    public AbstractOperation createOperation() {
        return new MulOperation();
    }
}

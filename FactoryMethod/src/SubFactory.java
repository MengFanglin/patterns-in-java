public class SubFactory implements Factory {
    @Override
    public AbstractOperation createOperation() {
        return new SubOperation();
    }
}

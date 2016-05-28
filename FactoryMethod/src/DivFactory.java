public class DivFactory implements Factory {
    @Override
    public AbstractOperation createOperation() {
        return new DivOperation();
    }
}

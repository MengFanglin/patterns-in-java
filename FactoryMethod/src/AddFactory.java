public class AddFactory implements Factory {
    @Override
    public AbstractOperation createOperation() {
        return new AddOperation();
    }
}

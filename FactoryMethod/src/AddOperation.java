public class AddOperation extends AbstractOperation {
    @Override
    public double getResult() {
        double numberA = getNumberA();
        double numberB = getNumberB();
        return numberA + numberB;
    }
}

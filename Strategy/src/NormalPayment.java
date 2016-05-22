public class NormalPayment extends AbstractPayment {
    @Override
    public double getPracticalMoney(double money) {
        return money;
    }
}

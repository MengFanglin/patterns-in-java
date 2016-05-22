public class DiscountPayment extends AbstractPayment {
    private double discount = 1d;

    public DiscountPayment(String discount) {
        this.discount = Double.parseDouble(discount) / 10;
    }

    @Override
    public double getPracticalMoney(double money) {
        return money * discount;
    }
}

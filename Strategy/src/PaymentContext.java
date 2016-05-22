public class PaymentContext {
    private AbstractPayment payment;

    public PaymentContext(AbstractPayment payment) {
        this.payment = payment;
    }

    public double getResult(double money) {
        return payment.getPracticalMoney(money);
    }
}

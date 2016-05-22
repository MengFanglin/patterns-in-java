public class RebatePayment extends AbstractPayment {
    // 返利条件
    private double condition = 0.0d;
    // 返利金额
    private double rebate = 0.0;

    public RebatePayment(String condition, String rebate) {
        this.condition = Double.parseDouble(condition);
        this.rebate = Double.parseDouble(rebate);
    }

    @Override
    public double getPracticalMoney(double money) {
        double result = money;
        if (money >= condition) {
            result = money - Math.floor(money / condition) * rebate;
        }
        return result;
    }
}

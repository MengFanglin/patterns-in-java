public class App {
    public static void main(String[] args) {
        PaymentContext context;
        //正常支付
        context = new PaymentContext(new NormalPayment());
        System.out.println("正常支付: " + context.getResult(320));

        // 八折支付
        context = new PaymentContext(new DiscountPayment("8"));
        System.out.println("八折支付: " + context.getResult(320));

        //满300减100
        context = new PaymentContext(new RebatePayment("300", "100"));
        System.out.println("满300减100支付: " + context.getResult(320));


    }
}

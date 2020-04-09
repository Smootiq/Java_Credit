public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        double percent = 9.99;
        int payment = (int) service.calculate(amount);
        System.out.println(payment);
    }
}
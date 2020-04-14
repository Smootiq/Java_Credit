public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        double percent = 9.99 / 100 / 12;
        double fix = (1 + percent)*(1 + percent)*(1 + percent)*(1 + percent)*(1 + percent)*(1 + percent)*(1 + percent)*(1 + percent)*(1 + percent)*(1 + percent)*(1 + percent)*(1 + percent);
        double fix1 = percent + (percent / (fix - 1));
        long payment = service.calculate(amount, (int) fix1);
        System.out.println(payment);
    }
}
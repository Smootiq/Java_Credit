public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double result;
        double payment;
        int amount = 1_000_000;
        double percent = 9.99 / 100 / 12;
        result = Math.pow(1 + percent, 12);
        payment = service.calculate(percent, result, amount);
        System.out.println(payment);
        result = Math.pow(1 + percent, 24);
        payment = service.calculate(percent, result, amount);
        System.out.println(payment);
        result = Math.pow(1 + percent, 36);
        payment = service.calculate(percent, result, amount);
        System.out.println(payment);
    }
}
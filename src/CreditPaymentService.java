public class CreditPaymentService {
    public long calculate(int amount) {
        double percent = 9.9 / 12;
        double payment = amount / 12 * percent;
        return (long) payment;
    }
}

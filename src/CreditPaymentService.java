public class CreditPaymentService {
    public long calculate(int amount, double fix1) {
        int payment = (int) (amount * fix1);
        return payment;
    }
}

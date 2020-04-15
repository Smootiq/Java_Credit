public class CreditPaymentService {
    public long calculate(double percent, double result, int amount) {
        int payment = (int) (((percent / (result - 1)) + percent) * amount);
        return payment;
    }
}
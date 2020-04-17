public class CreditPaymentService {
    public int calculate(int amount, int months, double rate) {
        double nrate = rate / 12 / 100;
        double powed = Math.pow(1 + nrate, months);
        double k = nrate * powed / (powed - 1);
        return (int) Math.round(k * amount);
    }
}
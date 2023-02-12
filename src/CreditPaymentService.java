public class CreditPaymentService {
    public int calculate(int amountCredit, int yearCount, double annualRate) {
        int monthCount = yearCount * 12;
        double i = annualRate / 12 / 100; // i = коэффициент для рассчета коэффициента аннуитета
        double numerator1 = i + 1;
        double numerator2 = Math.pow(numerator1, monthCount);
        double numerator = i * numerator2;
        double denominator = numerator2 - 1;
        double coefficient = numerator / denominator;
        double monthlyPayment = coefficient * amountCredit;
        return (int) monthlyPayment;

    }
}

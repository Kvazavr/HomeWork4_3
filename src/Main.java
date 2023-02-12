public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amountCredit = 1_000_000;
        int yearCount = 3;
        double annualRate = 9.99;
        int monthlyPayment = service.calculate(amountCredit, yearCount, annualRate);
        System.out.println(monthlyPayment);
    }
}
public class savingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12.0;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate (double percentage) {
        annualInterestRate = percentage;
    }

    public double printTheBalance() {
        return savingsBalance;
    }

    public savingsAccount(double i) {
        savingsBalance = i;
    }

}

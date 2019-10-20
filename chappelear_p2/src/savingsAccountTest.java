public class savingsAccountTest {
    public static void main(String[] args) {
        savingsAccount saver1 = new savingsAccount(2000.00);
        savingsAccount saver2 = new savingsAccount(3000.00);
        savingsAccount.modifyInterestRate(.04);
        int i;
        System.out.println("saver1 is on the left, saver 2 is on the right:");

        for (i = 1; i <= 12; ++i) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.print("month " + i + ":");
            System.out.printf("$ %.2f", saver1.printTheBalance());
            System.out.print("     ");
            System.out.printf("$ %.2f", saver2.printTheBalance());
            System.out.println("");
        }
        savingsAccount.modifyInterestRate(.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.print("The next month's values would be: ");
        System.out.print("saver1 = ");
        System.out.printf("$ %.2f", saver1.printTheBalance());
        System.out.print("     ");
        System.out.print("saver2 = ");
        System.out.printf("$ %.2f", saver2.printTheBalance());
    }
}

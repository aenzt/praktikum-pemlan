package Liang;

public class soal9_7 {
    public static void main(String[] args) {

        Account account = new Account(1122, 20_000);
        account.setannualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Balance in account " + account.getId() + " is now: $" + account.getBalance());
        System.out.println("Interest rate is " + account.getMonthlyInterestRate() + "% per month");
        System.out.println("Total interest is " + account.getMonthlyInterest());
        System.out.println("Liang.Account was created on " + account.getDateCreated());
    }
}

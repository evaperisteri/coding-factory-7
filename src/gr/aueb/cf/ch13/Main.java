package gr.aueb.cf.ch13;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(1, "GR87597938457", "Alice", "Wonderland",
                "S123", 1000.0);
        try {
            account.deposit(900);
            System.out.println("the deposit was successful.");

            account.withdraw(500, "R123");

            account.withdraw(200, "S123");
            System.out.println("Withdraw successful");

            System.out.println("Balance: " + account.getAccountBalance());
            System.out.println(account.accountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

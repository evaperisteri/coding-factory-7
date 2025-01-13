package gr.aueb.cf.ch13;

/**
 * Defines an {@link Account} class
 *
 * @author eva
 * @version 0.1
 * @since 07 jan
 */
public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account(){

    }

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*
     * Public API
     */

    /**
     * deposits a certain amount of money.
     * @param amount            the amount of money to be deposited
     * @throws Exception        if the amount is negative
     */
    public void deposit (double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception ("The amount must not be negative.");
            }
            balance = balance + amount;
            System.out.println("Amount " + amount + " successfully deposited."); //logging
        } catch (Exception e) {
            System.err.println("Error. Amount " + amount + " can not be negative!");
            //e.printStackTrace(); μονο κατα τη φαση του development
            throw e;
        }
    }

    /**
     * Wihdraws an amount of money from the {@link Account}
     * based on a valid ss checked by {@link Account#isSsnValid(String)}
     * @param amount            the amount to be withdrawn
     * @param ssn               the given ssn
     * @throws Exception        if ssn is not valid or the balance is not sufficient or the amount is negative
     */
    public void withdraw(double amount, String ssn)  throws Exception {
        try {
            if (!isSsnValid(ssn)){
                throw new Exception("Ssn " + ssn + " is not valid.");
            }

            if (amount > balance) {
                throw new Exception("Insufficient balance " + balance + "for amount " + amount);
            }

            if (amount < 0) {
                throw new Exception("The amount " + amount + " must not be negative");
            }

            balance = balance - amount;
            System.out.println("Amount " + amount + " successfully withdrawn."); //logging
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());
//            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the balance of the {@link Account}
     * @return the Account's balance
     * (delegate design pattern) (getter decorated with messages and logging)
     */
    public double getAccountBalance() {
        System.out.println("The account balance was returned");
        return getBalance();
    }

    /**
     * returns the string representation of the {@link Account} state.
     * @return the string-based format of the state of the {@link Account}
     */
    public String accountToString(){
        return "(" + id + ", " + iban + ", " + firstname + ", " + lastname + ", " + ssn + ", " + balance + ")";
    }


    //Internals

    private boolean isSsnValid (String ssn) {
        return this.ssn.equals(ssn);
    }


}

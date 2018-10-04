import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        String ownername = name;
        BankAccountType accountType = accountCategory;
        */
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     *  public int getAge() {
    return this.age;
     */

    private int getAccountNumber() {
        return this.accountNumber;
    }
    private double getAccountBalance() {
        return this.accountNumber;
    }
    private String getOwnerName() {
        return this.ownerName;
    }
    private double  getInterestEarned() {
        return this.interestEarned;
    }

}

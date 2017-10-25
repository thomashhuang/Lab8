/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * Different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * Checkings account.
         */
        CHECKINGS,
        /**
         * Savings account.
         */
        SAVINGS,
        /**
         * Student account.
         */
        STUDENT,
        /**
         * Workplace account.
         */
        WORKPLACE
    }

    /**
     * Account number.
     */
    private int accountNumber;

    /**
     * Account type.
     */
    private BankAccountType accountType;

    /**
     * Account balance.
     */
    private double accountBalance;

    /**
     * Name of the owner of the account.
     */
    private String ownerName;

    /**
     * Interest rate on the account.
     */
    private double interestRate;

    /**
     * Interest accumilated.
     */
    private double interestEarned;

    /**
     * Create a bank account under a certain name.
     * @param name The name of the owner.
     * @param accountCategory The account type.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        final int maxAccountNumber = 1_000_000_000;
        accountNumber = (int) (Math.random() * maxAccountNumber);
        accountType = accountCategory;
        accountBalance = 0;
        ownerName = name;
        interestRate = 0;
        interestEarned = 0;
    }

    /**
     * @return the accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @return the accountType
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * @return the accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param balance the accountBalance to set
     */
    public void setAccountBalance(final double balance) {
        this.accountBalance = balance;
    }

    /**
     * @return the ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @param newName the ownerName to set
     */
    public void setOwnerName(final String newName) {
        this.ownerName = newName;
    }

    /**
     * @return the interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * @param newRate the interestRate to set
     */
    public void setInterestRate(final double newRate) {
        this.interestRate = newRate;
    }

    /**
     * @return the interestEarned
     */
    public double getInterestEarned() {
        return interestEarned;
    }
}

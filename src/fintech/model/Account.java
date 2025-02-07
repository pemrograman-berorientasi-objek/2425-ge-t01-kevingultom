package fintech.model;

/**
 * @author 12S23001 Kevin Gultom
 * @author 12S23010 Tiffani Butar-Butar
 */
public class Account {
    private String owner;
    private String accountName;
    private double balance;
    
    public Account(String owner, String accountName) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = 0.0;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public String getAccountName() {
        return accountName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return accountName + "|" + owner + "|" + balance;
    }
}

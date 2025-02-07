package fintech.model;

/**
 * @author 12S23001 Kevin Gultom
 * @author 12S23010 Tiffani Butar-Butar
 */
public class Transaction {
    private String owner;
    private String accountName;
    private double balance;
    private double amount;
    private String posted_at;
    private String note;
    private String account_name2;
    private int id;

    
    public Transaction(String owner, String accountName, double balance, double amount, String posted_at, String note, String account_name2, int id) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = amount + balance;
        this.amount = amount;
        this.posted_at = posted_at;
        this.note = note;
        this.account_name2 = account_name2;
        this.id = 1;
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
    public double getAmount() {
        return amount;
    }
    
    public String getPosted_at() {
        return posted_at;
    }

    public String getNote() {
        return note;
    }

    public String getAccount_name2() {
        return account_name2;
    }

    public int getId() {
        return id;
    }   


    @Override
    public String toString() {
        return id + "|" + account_name2 + "|" + amount + "|" + posted_at + "|" + note + "|" + balance;
    }
}


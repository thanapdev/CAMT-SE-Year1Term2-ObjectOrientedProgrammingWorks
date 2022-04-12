package account;

public class Account {
    private String accNum;
    protected int balance;
    private double annualRate;
    private String dateCreated;
    public Account(){
        accNum = "642115037";
        balance = 0;
        annualRate = 0.1;
        dateCreated = "01/17/2022";
    }
    public Account(String accNum, int balance, double annualRate, String dateCreated){
        this.accNum = accNum;
        this.balance = balance;
        this.annualRate = annualRate;
        this.dateCreated = dateCreated;
    }
    public void deposit(int money){
        this.balance += money;
    }
    public void withdraw(int money){
        this.balance -= money;
    }
    public String toString(){
        return "Account: "+accNum+" Balance: "+balance+" Annual Interest Rate: "+annualRate+" Date Created: "+dateCreated;
    }
}

class CheckingAccount extends Account {
    public CheckingAccount(){
        super();
    }
    public CheckingAccount(String accNum, int balance, double annualRate, String dateCreated){
        super(accNum, balance, annualRate, dateCreated);
        
    }
    public void withdraw(int money){
        if(money <= this.balance){
            this.balance -= money;
        }
    }
}

class SavingsAccount extends Account {
    private int limit;
    public SavingsAccount(){
        super();
        this.limit = 3;
    }
    public SavingsAccount(String accNum, int balance, double annualRate, String dateCreated, int limit){
        super(accNum, balance, annualRate, dateCreated);
        this.limit = limit;
    }
    public void withdraw(int money){
        if(limit > 0){
            this.balance -= money;
            limit--;
        }
    }
    public String toString(){
        return super.toString()+" Limit: "+limit;
    }
}

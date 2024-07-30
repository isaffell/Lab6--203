
public class SavingsAccount extends BankAccount {
    private static final double RATE = 0.025;
    //annual interest
    private String accountNumber; 
    private int savingsNumber; 
    

   
    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
        this.savingsNumber = 0;
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public SavingsAccount(SavingsAccount original, double initialBalance) {
        super(original, initialBalance);
        this.savingsNumber = original.savingsNumber + 1;
       
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() {
        double monthlyInterest = getBalance() * (RATE / 12);
        deposit(monthlyInterest);
    }

    @Override
    public String getAccountNumber() {
        return this.accountNumber;
    }
}

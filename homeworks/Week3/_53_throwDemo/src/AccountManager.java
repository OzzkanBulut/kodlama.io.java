public class AccountManager {
    private double balance;

    public void deposit(double amount){
        balance = balance+amount;
    }

    public void withDraw(double amount) throws BalanceInsufficientException {
        if(balance>=amount){
            balance = balance-amount;
        }else{
            throw new BalanceInsufficientException("Baakiye yetersiz");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        System.out.println("Balance : " + accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println("Balance: "+ accountManager.getBalance());

        try {
            accountManager.withDraw(90);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("balance:"+accountManager.getBalance());
        try{
            accountManager.withDraw(50);
        }   catch(BalanceInsufficientException e){
            System.out.println(e.getMessage());
        }

    }
}
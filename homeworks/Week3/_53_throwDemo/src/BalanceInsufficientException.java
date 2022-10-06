public class BalanceInsufficientException extends Exception{
    String message;
    public BalanceInsufficientException(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}

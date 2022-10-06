public class CreditManager {
    private ICreditManager iCreditManager;
    // IoC Container
    // Burası polymorphismdir.İstediğin biçimi kullanabiliyosun
    public CreditManager(ICreditManager iCreditManager){
        this.iCreditManager = iCreditManager;
    }
    public void calculate(){
        iCreditManager.calculate();
    }
    public void save(Customer customer){
        iCreditManager.save();
    }

}

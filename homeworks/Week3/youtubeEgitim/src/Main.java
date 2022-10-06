public class Main {
    public static void main(String[] args) {
        Person person = new Person(1,"Rıdvan","Kılıç","12345");
        CreditManager creditManager = new CreditManager(new CarCreditManager());
        creditManager.save(person);


    }
}
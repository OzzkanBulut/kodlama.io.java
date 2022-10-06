public class CustomerManager {
    private Customer customer;
    public CustomerManager(Customer customer){
        this.customer = customer;

    }
    public void save(){
        System.out.println("Eklendi : "+customer.getFirstName());
    }

    public void delete(){
        System.out.println("Silindi : "+customer.getFirstName());
    }
}

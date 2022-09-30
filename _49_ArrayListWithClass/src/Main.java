import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Customer> customers = new ArrayList<>();
        Customer customer1 =new Customer(1,"ozkan","bulut");
        customers.add(customer1);
        Customer customer2 =new Customer(2,"mahmut","taş");
        customers.add(customer2);
        Customer customer3=new Customer(3,"hakkı","ateş");
        customers.add(customer3);

        for(Customer customer:customers){
            System.out.println(customer.firstName+" "+customer.lastName);
        }

    }
}
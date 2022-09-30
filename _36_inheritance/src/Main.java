public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        employeeManager.bestEmployee();
        employee.id = 1;
        customer.id = 12;
        System.out.println(customer.id);

    }
}
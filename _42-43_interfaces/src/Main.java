public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        // İnterfaceler katmanlar arası geçiş yapılırken kullanılır. Bağımlılığı engellemek için
        // Bir class birden fazla interfacei implement edebilir.

        customerManager.add();


    }
}
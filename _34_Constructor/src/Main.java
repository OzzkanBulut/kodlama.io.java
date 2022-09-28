public class Main {
    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", "Asus Laptop", 3, 5000, "Siyah");


        System.out.println(product.getName());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}
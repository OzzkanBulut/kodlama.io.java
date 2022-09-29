public class ProductManager {

    public void add(Product product) {
        if (ProductValidator.isValid(product)) {
            System.out.println("Added");
        } else {
            System.out.println("Ürün bilgileri geçersiz");
        }

        ProductValidator validator = new ProductValidator();
        validator.bisey();
    }
}

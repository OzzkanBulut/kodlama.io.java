package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao,Logger[] loggers) { // Sadece interface e bağlı --> Loosely coupled
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception { // response request pattern yapıya göre ilerde tekrar ele alınacak
        // iş kuralları
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }

        productDao.add(product);

        for(Logger logger:loggers){
            logger.log(product.getName());
        }


    }
}

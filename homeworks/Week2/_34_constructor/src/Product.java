public class Product {

    // Constructor
    public Product(int id, String name, String description, int stockAmount, double price, String renk) {
        System.out.println("Yapıcı blok çalıştı");
        this.id = id;
        this.name = name;
        this.description = description;
        this.stockAmount = stockAmount;
        this.price = price;
        this.renk = renk;
    }

    public Product(){ // Overloading --> Aynı isimle farklı parametreler kullanan fonksiyonlar

    }

    // attribute veya field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    private String renk;

    private String kod;

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public int getId() { //getter
        return id;
    }

    public void setId(int id) { //setter
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return name;

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }


}

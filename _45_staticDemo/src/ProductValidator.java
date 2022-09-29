public class ProductValidator { // Temel class static olamaz

    // Bir metodu static yaptıgımızda class ismiyle direk çağırabiliriz
    // Ama Static tanımladığın bir şey uygulama durana kadar bellekten atılmıyor
    // Utility tarzı araç kullanımlarında static yapılır
    // validator gibi
    static {    // static için constructor
        System.out.println("Static constructor");
    }

    public ProductValidator() { // newlendiğinde çalışır
        System.out.println("constructor");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void bisey() {}

//    public static class InnerClass{ // Innerclass static olabiliyor
//        public static void sil(){
//
//        }
//    }
}

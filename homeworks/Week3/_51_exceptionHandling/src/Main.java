public class Main {
    public static void main(String[] args) {

        try {
            int[] numbers = new int[]{1, 2, 3};
            System.out.println(numbers[3]); // hata
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("String error logged: " + exception);
        } catch (ArrayIndexOutOfBoundsException exception) { // hata türüne özel kod yazabilirsin
            System.out.println("Array index error Logged: " + exception);
        } catch (Exception exception) { // Ya da genel olarak bir hata varsa temel bi kod yazabilirsin
            System.out.println("Error Logged: " + exception);
        } finally {
            System.out.println("Ben her türlü çalışırım");
        }
        // veritabanına veya dosyalara bağlandığımızda işimiz bittikten
        //        sonra kapamak için finally kullanılır


    }
}
public class Main {
    public static void main(String[] args) {

        try{
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[3]); // hata
        }
        catch( Exception exception){
            System.out.println(exception);
        }
        finally {
            System.out.println("Ben her türlü çalışırım");
        }
        // veritabanına veya dosyalara bağlandığımızda işimiz bittikten
        //        sonra kapamak için finally kullanılır



    }
}
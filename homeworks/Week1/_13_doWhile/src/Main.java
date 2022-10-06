public class Main {
    public static void main(String[] args) {

        int i = 0;
    // şart sağlanmasa bile bir kez uyguluyor , i nin 10 oldugunu da yazıyor
        // yapılan işlemleri loglamak icin kullanilri genelde
        do{
            i++;
            System.out.println(i);
        }
        while(i<10);

    }
}
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList everything = new ArrayList();
        everything.add("Ahmet");
        everything.add(2.43);
        everything.add(1);// integer da ekleyebiliyosun bu sıkıntı

        ArrayList<String> cities = new ArrayList<String>(); // Arraylist burada string ile çalışan generic bi classtır
        cities.add("Ankara");
        cities.add("Istanbul");
//        cities.add(1); --> Buna kızar çünkü bi string arraylisti bu
        // Generic farklı tiplerle çalışmamızı sağlar
        // Tip güvenli bir çalışma biçimidir

        MyList<Customer> sehirler = new MyList<Customer>();
        sehirler.add(new Customer());
        sehirler.add(new Customer());


    }
}
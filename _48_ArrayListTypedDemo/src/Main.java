import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Ankara");
        cities.add("Istanbul");
        cities.add("Izmir");
        cities.add("Aydın");
        cities.add("Diyarbakir");
        cities.remove("Istanbul");
        cities.add("Bursa");
//        Collections.sort(cities);
        for(String city : cities){
            System.out.println(city);
        }




    }
}
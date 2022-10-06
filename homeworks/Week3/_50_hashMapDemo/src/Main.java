import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap <String,String> sozluk = new HashMap<String,String>();
        sozluk.put("Book","Kitap");
        sozluk.put("Table","Masa");
        sozluk.put("Pencil","Kalem");
        sozluk.put("Mouse","Fare");
        sozluk.put("Cat","Kedi");
        System.out.println(sozluk.get("Table")); // Case sensitive
//        sozluk.remove("Cat");  Remove
        System.out.println("size : "+ sozluk.size());
        System.out.println(sozluk.keySet());
//        sozluk.clear();       --->    Sozlugu tamamen siler
//        Customer customer;    --->    Bu null bir ifade çünkü newlemedik

        for(String c : sozluk.keySet()){
            System.out.println("Key: "+ c+ " Value "+ sozluk.get(c)); // sozluk.get o keyin valuesini getirir
        }



    }
}
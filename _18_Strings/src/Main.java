import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String message = " Weather is Sunny today ";
        System.out.println(message);

        String newMessage= message.replace(" ","_");
        System.out.println(newMessage);

        System.out.println(message.substring(11,16)); // Stringin istediğimiz kısmını alır

        for(String word:message.split(" ")){ // Split stringi boşluklara göre ayırdı 4 kelime oluştu
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        System.out.println(message.trim());

    }
}
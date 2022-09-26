public class Main {
    public static void main(String[] args) {

        String message = "Weather is beautiful";
        System.out.println(message);

        System.out.println("Eleman sayisi : " + message.length());
        System.out.println("5. eleman :" + message.charAt(4));

        System.out.println(message.concat(" Today")); // Sadece sonuna ekler , stringi değiştirmez
        System.out.println(message); // Yazdigimizda today eklenmemiş bir şekildedir

        System.out.println(message.startsWith("W"));
        System.out.println(message.endsWith("k"));

        char[] characters = new char[7];
        message.getChars(0, 7, characters, 0);
        System.out.println(characters);


        System.out.println("first index of e " + message.indexOf("e")); // Belirtilen stringin soldaki ilk pozisyonunu yazar

        System.out.println("last index of e "+ message.lastIndexOf("e")); // Stringin soldaki son pozisyonunu yazar
    }
}
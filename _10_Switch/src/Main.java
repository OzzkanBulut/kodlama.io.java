public class Main {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mükemel Geçtiniz");
                break;
            case 'B':
                System.out.println("Fena Degil");
                break;
            case 'C':
                System.out.println("Salak");
                break;
            default:
                System.out.println("Gecersiz girdin la");

        }
    }
}
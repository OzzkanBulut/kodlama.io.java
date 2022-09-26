public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager1;
        CustomerManager customerManager2 = new CustomerManager();
        customerManager1 = customerManager2;
        customerManager1.Add();
        customerManager1.Remove();
        customerManager1.Update();

        int num1 = 10;
        int num2 = 20;

        num2 = num1;
        num1 = 30;

        System.out.println(num2); // = 10

        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2 = new int[]{4, 5, 6}; // Bura artık çöp

        numbers2 = numbers1; // Artık numbers2 de adres olarak numbers1 in degerlerini gösteriyor
        numbers1[0] = 10;
        System.out.println(numbers2[0]);
        System.out.println(numbers2[0] + " " + numbers2[1]);


    }
}


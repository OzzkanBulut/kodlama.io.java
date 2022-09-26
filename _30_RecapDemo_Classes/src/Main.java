import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    DortIslem calculator = new DortIslem();
        System.out.println("Enter 2 numbers:");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        calculator.add(num1,num2);
        calculator.divide(num1,num2);
        calculator.multiply(num1,num2);
        System.out.println("jkgnkjdf");

    }
}
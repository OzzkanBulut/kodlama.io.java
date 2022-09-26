import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    DortIslem calculator = new DortIslem();
        System.out.println("Enter 2 numbers:");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int sum = calculator.add(num1,num2);
        double division = calculator.divide(num1,num2);
        int multiplication = calculator.multiply(num1,num2);
        int subtraction = calculator.subtract(num1,num2);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " +subtraction);
        System.out.println("Division: " + division);
        System.out.println("Multiplication: " + multiplication);

    }
}
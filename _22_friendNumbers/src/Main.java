import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int num1,num2, sum1=0,sum2=0;
        System.out.println("Enter 2 numbers");
        num1=scan.nextInt();
        num2= scan.nextInt();
        for(int i = 1 ; i< num1;i++){
            if(num1 % i == 0){
                sum1=sum1+i;
            }
        }
        for(int i = 1;i<num2;i++){
            if(num2 % i == 0){
                sum2 = sum2+i;
            }
        }

        if(sum1==num2 && sum2==num1){
            System.out.println( num1+ " and "+ num2+  " are friends");
        }


    }
}
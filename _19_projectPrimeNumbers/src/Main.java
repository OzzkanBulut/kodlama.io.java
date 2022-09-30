public class Main {
    public static void main(String[] args) {
        int num = -1;
        boolean isPrime = true;
        if(num<1){
            System.out.println("Gecersiz Sayi ");
            return;
        }
        if(num==1){
            System.out.println("Sayi asal degildir");
            return;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println(num + " is prime");
        } else
            System.out.println(num + " is not prime");
        /*int count=0;
        for(int i = 1;i<=num;i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count==2){
            System.out.println(num + " is prime.");
        }
        else
            System.out.println(num+" is not prime");
    }*/

    }
}
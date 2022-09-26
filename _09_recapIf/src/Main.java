public class Main {
    public static void main(String[] args) {

        int num1 = 20;
        int num2= 25;
        int num3 = 2;

        int big = 0 ;
        if(num1>num2 && num1>num3){
            big = num1;
        }
        else if(num2>num1 && num2>num3){
            big = num2;
        }
        else if(num3>num1 && num3>num2){
            big = num3;
        }
        System.out.println(big);

    }
}
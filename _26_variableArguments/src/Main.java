public class Main {
    public static void main(String[] args) {

        int sum = add(1,2,3,4,5,6,7,8,9,32);
        System.out.println(sum);
    }

    // Burdaki sayilar bir integer array gibi calisiyo
    public static int add(int... numbers){
    int sum = 0;
    for(int num:numbers){
        sum=sum+num;
    }
    return sum;


    }
}
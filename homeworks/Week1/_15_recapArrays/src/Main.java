public class Main {
    public static void main(String[] args) {

        double[] myList = {1.2, 3.5, 4.2, 7.5};
        double sum = 0;
        double max = myList[0];
        for (double element : myList) {
            if (max < element) {
                max = element;
            }
            sum = sum + element;
            System.out.println(element);
        }

        System.out.println("Sum : " + sum);
        System.out.println("max : " + max);

    }
}
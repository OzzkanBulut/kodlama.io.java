public class DortIslem {

    public int add(int num1, int num2) {

        return num1 + num2;
    }

    public int subtract(int num1, int num2) {

        return num1 - num2;
    }

    public int multiply(int num1, int num2) {

        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        else
            System.out.println("Divider cannot be 0!");
        return 0;
    }
}

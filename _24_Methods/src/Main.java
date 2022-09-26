public class Main {
    public static void main(String[] args) {

        findNumbers();
    }

    public static void findNumbers() {
        boolean isHere = false;
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};

        int toFind = 22;
        for (int number : numbers) {
            if (toFind == number) {
                isHere = true;
                break;
            } else
                isHere = false;
        }
        if (isHere == true) {
            giveMessage(toFind + " is here");
        } else
            System.out.println(toFind + " is not here");

    }

    public static void giveMessage(String message) {
        System.out.println("message");

    }
}



public class Main {
    public static void main(String[] args) {

        String[][] Cities = new String[3][3];

        Cities[0][0] = "Istanbul";
        Cities[0][1] = "Ankara";
        Cities[0][2] = "Aydın";
        Cities[1][0] = "İzmir";
        Cities[1][1] = "Manisa";
        Cities[1][2] = "Mardin";
        Cities[2][0] = "Trabzon";
        Cities[2][1] = "Çanakkale";
        Cities[2][2] = "Adana";


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Cities[i][j] + " ");
            }
            System.out.println();

        }

    }
}
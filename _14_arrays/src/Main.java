public class Main {
    public static void main(String[] args) {

        String student1 = "Engin";
        String student2 = "Demir";
        String student3 = "Ahmet";

        String[] students = new String[3];

        students[0] = "Engin";
        students[1] = "Demir";
        students[2] = "Ahmet";

        // Bu daha ii
        for (String student : students) {
            System.out.println(student);
        }


    }
}
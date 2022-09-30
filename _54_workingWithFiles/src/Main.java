import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        readFile();
//        getFileInfo();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File file = new File("C:\\projects\\kodlama.io.java\\_00_files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu");
            } else {
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\projects\\kodlama.io.java\\_00_files\\students.txt");
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Is writable: " + file.canWrite());
            System.out.println("Is readable: " + file.canRead());
            System.out.println("File size: " + file.length());
        }
    }

    public static void readFile() {

        File file = new File("C:\\projects\\kodlama.io.java\\_00_files\\students.txt");

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\projects\\kodlama.io.java\\_00_files\\students.txt", true));
            writer.write("aaa");
            writer.newLine();
            writer.write("ooo");
            System.out.println("yazıldı");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
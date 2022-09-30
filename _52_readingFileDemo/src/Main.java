import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) { // ioexception çıkarabilir dikkat et diye uyarıyo yazılımcıyı
        int total = 0;
        String line = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\projects\\kodlama.io.java\\_52_readingFileDemo\\src\\numbers.txt"));
            while ((line = reader.readLine()) != null) {
                total = total + Integer.valueOf(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Total : "+total);
    }
}
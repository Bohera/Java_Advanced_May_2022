package StreamsFilesAndDirectoriesExercises;

import java.io.FileInputStream;
import java.io.IOException;

public class test_01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("inputExercises.txt");

        int oneByte = fis.read();

        while (oneByte >= 0){
            System.out.println((char) oneByte);
            oneByte = fis.read();
        }
        fis.close();

    }
}

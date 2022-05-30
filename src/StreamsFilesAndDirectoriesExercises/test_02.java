package StreamsFilesAndDirectoriesExercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test_02 {
    public static void main(String[] args) throws IOException {

        FileReader fis = new FileReader("inputExercises.txt");
        BufferedReader bufferedReader = new BufferedReader(fis);

        BufferedReader bf = new BufferedReader(new FileReader(" asjdsadas "));


        int oneByte = fis.read();
        while (oneByte >= 0) {
            System.out.println((char) oneByte);
            oneByte = fis.read();
        }
        fis.close();


    }
}

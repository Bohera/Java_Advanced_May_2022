package StreamsFilesAndDirectoriesExercises;

import java.io.*;
import java.util.Scanner;

public class test_03 {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fis = new FileInputStream("asdasda");){
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

        FileInputStream fis = new FileInputStream("asdasda");
        int oneByte = fis.read();

        FileReader fr = new FileReader("asdasda");
        int oneChar = (char) fr.read();

        Scanner scan = new Scanner(fis);
        PrintWriter pw = new PrintWriter(new FileWriter("asdasda"));
    }

}

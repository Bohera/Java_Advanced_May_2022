package StreamsFilesAndDirectoriesExercises;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class ALLCAPITALS_03 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("Resources/inputExercises.txt"));
             PrintWriter pw = new PrintWriter(new FileWriter("Resources/output.txt"))) {
            br.lines().forEach(line -> pw.println(line.toUpperCase()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

package StreamsFilesAndDirectoriesExercises;

import java.io.*;

public class SumLines_01 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Resources/inputExercises.txt"))) {

            String line = bufferedReader.readLine();
                while (line != null) {
                    long sum = 0;
                    char[] charactersFromLine = line.toCharArray();
                    for (char singleCharacter : charactersFromLine) {
                        sum += singleCharacter;
                    }
                    System.out.println(sum);
                    line = bufferedReader.readLine();
                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

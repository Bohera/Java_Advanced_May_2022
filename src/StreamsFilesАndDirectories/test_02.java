package StreamsFilesАndDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class test_02 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\PC\\Desktop\\04.Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        Scanner scanner = new Scanner(inputStream);

        String line = scanner.nextLine();

        while (scanner.hasNextLine()) {
            System.out.println(line);

            line = scanner.nextLine();
        }
    }
}

package StreamsFilesАndDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile_01 {
    public static void main(String[] args) {
        String path = "input.txt";


        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            int oneByte = fileInputStream.read();

            while (oneByte != -1) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = fileInputStream.read();
            }

        } catch (IOException ignored) {

        }





    }

}

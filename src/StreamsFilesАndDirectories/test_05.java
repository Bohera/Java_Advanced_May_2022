package StreamsFilesАndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test_05 {
    public static void main(String[] args) {
        String path = "input.txt";


        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

            int oneByte = fileInputStream.read();

            while (oneByte != -1) {
                String output = Integer.toBinaryString(oneByte) + " ";

                for (char c : output.toCharArray()) {
                    fileOutputStream.write(c);
                }


                oneByte = fileInputStream.read();
            }

        } catch (IOException ignored) {

        }
    }
}

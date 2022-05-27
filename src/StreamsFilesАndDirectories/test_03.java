package StreamsFilesАndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class test_03 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\PC\\Desktop\\04.Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        int bytte = fileInputStream.read();

        while (bytte != -1) {
            System.out.print((char) bytte);
            bytte = fileInputStream.read();
        }

    }
}

